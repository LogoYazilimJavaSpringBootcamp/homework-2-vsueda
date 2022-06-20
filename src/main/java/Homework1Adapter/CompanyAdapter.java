package Homework1Adapter;

import Homework1Manager.Action;
import Homework1Model.Bill;
import Homework1Model.Company;

import java.util.ArrayList;

public class CompanyAdapter<E> extends Action {

    private long sumPay = 0;


    public void listAllComponies(ArrayList<Company> companiesList) {
        companiesList.forEach(company -> {
            System.out.println(company.getCompanyName() + " / " + company.getCompanySector());
        });
    }

    public ArrayList<Company> companiesbyAvr(Boolean isMuch, ArrayList<Bill> billsList, int avr) {
        ArrayList<Company> searchedCompaniesList = new ArrayList<>();
        ArrayList<Company> tempList = new ArrayList<>();
        if (isMuch) {
            billsList.forEach(bill -> {
                billsList.forEach(otherBill -> {
                    if (bill.getCompany().getCompanyId() == otherBill.getCompany().getCompanyId()) {
                        sumPay += bill.getItem().getItemPrice();
                        tempList.add(bill.getCompany());
                    }
                });
                if (sumPay / tempList.size() > avr) {
                    searchedCompaniesList.add(bill.getCompany());
                }
            });
            return searchedCompaniesList;
        } else {
            billsList.forEach(bill -> {
                billsList.forEach(otherBill -> {
                    if (bill.getCompany().getCompanyId() == otherBill.getCompany().getCompanyId()) {
                        sumPay += bill.getItem().getItemPrice();
                        tempList.add(bill.getCompany());
                    }
                });
                if (sumPay / tempList.size() < avr) {
                    searchedCompaniesList.add(bill.getCompany());
                }
            });
            return searchedCompaniesList;
        }
    }
}

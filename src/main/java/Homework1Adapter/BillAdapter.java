package Homework1Adapter;

import Homework1Manager.Action;
import Homework1Model.Bill;
import Homework1Model.Customer;

import java.time.LocalDate;
import java.util.ArrayList;

public class BillAdapter<E> extends Action {
    private long sumPay = 0;

    public void listAllBills(ArrayList<Bill> billsList) {
        billsList.forEach(e -> {
            System.out.println("\n_______________________________________________________\n");
            System.out.println("Fatura sahibi: " + e.getCustomer().getCustomerName() + " " + e.getCustomer().getCustomerSurname() +
                    "\n Islem Yapilan Firma: " + e.getCompany().getCompanyName() + "/" + e.getCompany().getCompanySector() +
                    "\n Alinan urun: " + e.getItem().getItemName() +
                    "\n Odeme: " + e.getItem().getItemPrice());
            System.out.println("\n_______________________________________________________\n");
        });
    }

    //Tüm faturalar için toplam tutar hesaplama
    public long sumPay(ArrayList<Bill> billsList) {
        billsList.forEach(bill -> {
            sumPay += bill.getItem().getItemPrice();
        });
        return sumPay;
    }

    //Belirli müşteriler için toplam tutar hesaplama
    public long sumPay(ArrayList<Customer> customersList, ArrayList<Bill> billsList) {
        billsList.forEach(bill -> {
            customersList.forEach(customer -> {
                if (bill.getCustomer().getCustomerId() == customer.getCustomerId()) {
                    sumPay += bill.getItem().getItemPrice();
                }
            });

        });
        return sumPay;
    }

    //Eğer gönderilen değer true ise istenilen değerden yukarıdaki false ise istenilen değerden aşağıdaki sonuçları ekrana getirmektedir.
    public ArrayList<Bill> searchbyItemPrice(Boolean isMuch, ArrayList<Bill> billsList, int price) {

        ArrayList<Bill> searchedBillList = new ArrayList<>();
        if (isMuch) {
            billsList.forEach(bill -> {
                if (bill.getItem().getItemPrice() > price) {
                    searchedBillList.add(bill);
                }
            });
            return searchedBillList;
        } else {
            billsList.forEach(bill -> {
                if (bill.getItem().getItemPrice() < price) {
                    searchedBillList.add(bill);
                }
            });
            return searchedBillList;
        }

    }

    public long calculateAvr(ArrayList<Bill> billsList) {
        return sumPay(billsList) / billsList.size();
    }

    public ArrayList<Bill> searchBillsTransactionbyMonth(ArrayList<Bill> billsList, LocalDate date) {
        ArrayList<Bill> searchedBillsList = new ArrayList<>();
        billsList.forEach(bill -> {
            if (bill.getBillLocalDate().getMonth().equals(date.getMonth())) {
                searchedBillsList.add(bill);
            }
        });
        return searchedBillsList;
    }


}

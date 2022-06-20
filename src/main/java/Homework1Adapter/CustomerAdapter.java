package Homework1Adapter;

import Homework1Manager.Action;
import Homework1Model.Bill;
import Homework1Model.Customer;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Locale;

public class CustomerAdapter<E> extends Action {

    public void listAllCustomers(ArrayList<Customer> customerList) {
        customerList.forEach(e -> {
            System.out.println(e.getCustomerName() + " " + e.getCustomerSurname());
        });
    }

    public void listAllCustomersbyBill(ArrayList<Bill> billsList) {
        billsList.forEach(bill -> {
            System.out.println(bill.getCustomer().getCustomerName() + " " + bill.getCustomer().getCustomerSurname());
        });
    }

    public void searchCustomer(ArrayList<Customer> customerList, String word) {
        customerList.forEach(e -> {
            if (e.getCustomerName().toLowerCase(Locale.ROOT).contains(word)) {
                System.out.println(e.getCustomerName() + " " + e.getCustomerSurname());
            }
        });

    }

    public ArrayList<Customer> searchCustomerCreatebyMonth(ArrayList<Customer> customerList, LocalDate date) {
        ArrayList<Customer> searchedCustomerList = new ArrayList<>();
        customerList.forEach(e -> {
            if (e.getCustomerCreateDate().getMonth().equals(date.getMonth())) {
                searchedCustomerList.add(e);
            }
        });
        return searchedCustomerList;
    }

}

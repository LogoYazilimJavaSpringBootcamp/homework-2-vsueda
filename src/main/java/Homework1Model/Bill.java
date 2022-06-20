package Homework1Model;

import java.time.LocalDate;

public class Bill {
    private Customer customer;
    private static Item item;
    private Company company;
    private LocalDate billLocalDate;

    public Bill() {

    }

    public Bill(Customer customer, Item item, Company company, LocalDate billLocalDate) {
        this.customer = customer;
        this.item = item;
        this.company = company;
        this.billLocalDate = billLocalDate;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public static Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public LocalDate getBillLocalDate() {
        return billLocalDate;
    }

    public void setBillLocalDate(LocalDate billLocalDate) {
        this.billLocalDate = billLocalDate;
    }
}

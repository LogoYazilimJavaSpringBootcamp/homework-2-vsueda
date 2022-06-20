package Homework1Model;

import java.time.LocalDate;

public abstract class Customer {
    private int customerId;
    private String customerName;
    private String customerSurname;
    private String customerPhone;
    private String customerMail;
    private int customerAge;
    private LocalDate customerCreateDate;

    public Customer() {

    }

    public Customer(int customerId, String customerName, String customerSurname, String customerPhone, String customerMail, int customerAge, LocalDate customerCreateDate) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.customerSurname = customerSurname;
        this.customerPhone = customerPhone;
        this.customerMail = customerMail;
        this.customerAge = customerAge;
        this.customerCreateDate = customerCreateDate;
    }

    public abstract void ageControl();

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerSurname() {
        return customerSurname;
    }

    public void setCustomerSurname(String customerSurname) {
        this.customerSurname = customerSurname;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

    public String getCustomerMail() {
        return customerMail;
    }

    public void setCustomerMail(String customerMail) {
        this.customerMail = customerMail;
    }

    public int getCustomerAge() {
        return customerAge;
    }

    public void setCustomerAge(int customerAge) {
        this.customerAge = customerAge;
    }

    public LocalDate getCustomerCreateDate() {
        return customerCreateDate;
    }

    public void setCustomerCreateDate(LocalDate customerCreateDate) {
        this.customerCreateDate = customerCreateDate;
    }
}

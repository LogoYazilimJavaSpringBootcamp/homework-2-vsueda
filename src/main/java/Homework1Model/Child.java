package Homework1Model;

import java.time.LocalDate;

public class Child extends Customer {

    public Child(int customerId, String customerName, String customerSurname, String customerPhone, String customerMail, int customerAge, LocalDate customerCreateDate) {
        super(customerId, customerName, customerSurname, customerPhone, customerMail, customerAge, customerCreateDate);
    }

    @Override
    public void ageControl() {
        System.out.println("Yaşnız 18'den küçüktür.");
    }
}

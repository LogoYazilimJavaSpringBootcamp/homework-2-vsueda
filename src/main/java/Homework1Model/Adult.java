package Homework1Model;

import java.time.LocalDate;

public class Adult extends Customer {

    public Adult(int customerId, String customerName, String customerSurname, String customerPhone, String customerMail, int customerAge, LocalDate customerCreateDate) {
        super(customerId, customerName, customerSurname, customerPhone, customerMail, customerAge, customerCreateDate);
    }

    @Override
    public void ageControl() {
        System.out.println("Yaşınız 18'den büyüktür");
    }
}

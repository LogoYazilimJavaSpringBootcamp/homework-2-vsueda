package Homework1Main;

import Homework1Adapter.BillAdapter;
import Homework1Adapter.CompanyAdapter;
import Homework1Adapter.CustomerAdapter;
import Homework1Model.Bill;
import Homework1Model.Customer;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {

    private static HashMap appHashMap = new HashMap();
    private static CustomerAdapter customerAdapter = new CustomerAdapter();
    private static CompanyAdapter companyAdapter = new CompanyAdapter();
    private static BillAdapter billAdapter = new BillAdapter();
    private static ArrayList<Customer> customersList = new ArrayList<>();

    public static void main(String[] args) {
        Create createApp = new Create();
        appHashMap = createApp.create();

        //Tüm müşterileri listele
        System.out.println("\n\nMusteriler: \n");
        customerAdapter.listAllCustomers((ArrayList<Customer>) appHashMap.get(1));
        System.out.println("\n\n_______________________________________________________\n\n");


        //İçerisinde c harfi olan müşteriler
        System.out.println("Icerisinde C harfi olan musteriler: ");
        customerAdapter.searchCustomer((ArrayList<Customer>) appHashMap.get(1), "c");
        System.out.println("\n\n_______________________________________________________\n\n");


        //Haziran ayında kayıt olan müşterilerin faturalarınının toplam tutarı
        System.out.println("Haziran ayi toplam tutar");
        customersList = customerAdapter.searchCustomerCreatebyMonth((ArrayList<Customer>) appHashMap.get(1), LocalDate.of(2022, 6, 1));
        System.out.println(billAdapter.sumPay(customersList, (ArrayList<Bill>) appHashMap.get(4)));
        System.out.println("\n\n_______________________________________________________\n\n");


        //Sistemdeki tüm faturaları listele
        System.out.println("Tum Faturalar");
        billAdapter.listAllBills((ArrayList<Bill>) appHashMap.get(4));
        System.out.println("\n\n_______________________________________________________\n\n");


        //Sistemdeki 1500TL üstündeki faturalar
        System.out.println("1500 lira uzerindeki faturalar");
        billAdapter.listAllBills(billAdapter.searchbyItemPrice(true, (ArrayList<Bill>) appHashMap.get(4), 1500));
        System.out.println("\n\n_______________________________________________________\n\n");


        //Sistemdeki 1500TL üstündeki faturalarin ortalamasi
        System.out.println("1500 TL uzerindeki faturalarin ortalamasi");
        System.out.println(billAdapter.calculateAvr(billAdapter.searchbyItemPrice(true, (ArrayList<Bill>) appHashMap.get(4), 1500)));
        System.out.println("\n\n_______________________________________________________\n\n");


        //Sistemdeki 500TL altındaki faturalara sahip müşterilerin isimleri listeleyin
        System.out.println("500 TL altindaki faturalara sahip musterilerin isimleri");
        customerAdapter.listAllCustomersbyBill(billAdapter.searchbyItemPrice(false, (ArrayList<Bill>) appHashMap.get(4), 500));
        System.out.println("\n\n_______________________________________________________\n\n");


        //Haziran ayı faturalarının ortalaması 750 altı olan firmalarının hangi sektörde olduğunu listeleyin
        System.out.println("Haziran ayinde ortalamasi 750 TL altindaki faturalara sahip firmalarin isimleri ve sektorleri");
        companyAdapter.listAllComponies(companyAdapter.companiesbyAvr(false, billAdapter.searchBillsTransactionbyMonth((ArrayList<Bill>) appHashMap.get(4), LocalDate.of(2022, 6, 1)), 750));
        System.out.println("\n\n_______________________________________________________\n\n");
    }


}

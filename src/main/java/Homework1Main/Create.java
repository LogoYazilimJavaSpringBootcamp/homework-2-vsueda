package Homework1Main;

import Homework1Adapter.BillAdapter;
import Homework1Adapter.CompanyAdapter;
import Homework1Adapter.CustomerAdapter;
import Homework1Adapter.ItemAdapter;
import Homework1Model.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;

public class Create {
    private HashMap hashMap = new HashMap();

    public HashMap<Integer, ArrayList> create() {

        //Müşteri Oluşturma
        Customer customer = new Adult(1, "Sueda", "Varkal", "55", "mail", 21, LocalDate.now());
        Customer customer2 = new Adult(2, "Ayse", "Basaran", "545", "mail2", 47, LocalDate.of(2022, 5, 1));
        Customer customer3 = new Child(3, "Cengiz", "Under", "553", "mail3", 9, LocalDate.now());
        Customer customer4 = new Adult(4, "Enes", "Yardim", "255", "mail4", 23, LocalDate.of(2022, 5, 1));
        Customer customer5 = new Adult(5, "Nazan", "Yilmaz", "5533", "mail5", 35, LocalDate.now());


        //Ürün Oluşturma
        Item item = new Item(1, "Bilgisayar", 20000);
        Item item2 = new Item(2, "Telefon", 6000);
        Item item3 = new Item(3, "Sigara", 40);
        Item item4 = new Item(4, "Cikolata", 20);
        Item item5 = new Item(5, "Yagli Boya", 500);
        Item item6 = new Item(6, "Tuval", 1000);
        Item item7 = new Item(7, "Kedi Kabi", 500);
        Item item8 = new Item(8, "Kedi Mamasi", 600);

        //Firma oluşturma
        Company company = new Company(1, "Dell", "Elektronik", item);
        Company company2 = new Company(2, "Huawei", "Elektronik", item2);
        Company company3 = new Company(3, "Migros", "Super Market", item3);
        Company company4 = new Company(3, "Migros", "Super Market", item4);
        Company company5 = new Company(4, "Sudor", "Hobi", item5);
        Company company6 = new Company(4, "Sudor", "Hobi", item6);
        Company company7 = new Company(5, "Purina", "Pet Shop", item7);
        Company company8 = new Company(5, "Purina", "Pet Shop", item8);

        //Fatura oluşturma
        Bill bill = new Bill(customer, item5, company5, LocalDate.now());
        Bill bill2 = new Bill(customer, item3, company3, LocalDate.now());
        Bill bill3 = new Bill(customer, item, company, LocalDate.now());
        Bill bill4 = new Bill(customer2, item4, company4, LocalDate.now());
        Bill bill5 = new Bill(customer2, item2, company2, LocalDate.now());
        Bill bill6 = new Bill(customer3, item4, company4, LocalDate.now());
        Bill bill7 = new Bill(customer3, item6, company6, LocalDate.now());
        Bill bill8 = new Bill(customer4, item7, company7, LocalDate.now());
        Bill bill9 = new Bill(customer4, item8, company8, LocalDate.now());
        Bill bill10 = new Bill(customer4, item3, company3, LocalDate.now());
        Bill bill11 = new Bill(customer5, item, company, LocalDate.now());
        Bill bill12 = new Bill(customer5, item3, company3, LocalDate.now());
        Bill bill13 = new Bill(customer5, item5, company5, LocalDate.now());


        //Customer list
        CustomerAdapter<Customer> customerAdapterList = new CustomerAdapter<>();
        customerAdapterList.add(customer);
        customerAdapterList.add(customer2);
        customerAdapterList.add(customer3);
        customerAdapterList.add(customer4);
        customerAdapterList.add(customer5);
        ArrayList<Customer> customersList = customerAdapterList.getList();

        //Item list
        ItemAdapter<Item> itemAdapterList = new ItemAdapter();
        itemAdapterList.add(item);
        itemAdapterList.add(item2);
        itemAdapterList.add(item3);
        itemAdapterList.add(item4);
        itemAdapterList.add(item5);
        itemAdapterList.add(item6);
        itemAdapterList.add(item7);
        itemAdapterList.add(item8);
        ArrayList<Item> itemsList = itemAdapterList.getList();

        //Company list
        CompanyAdapter<Company> companyAdapterList = new CompanyAdapter<>();
        companyAdapterList.add(company);
        companyAdapterList.add(company2);
        companyAdapterList.add(company3);
        companyAdapterList.add(company4);
        companyAdapterList.add(company5);
        companyAdapterList.add(company6);
        companyAdapterList.add(company7);
        companyAdapterList.add(company8);
        ArrayList<Company> companiesList = companyAdapterList.getList();

        //Bill list
        BillAdapter<Bill> billsAdapterList = new BillAdapter<>();
        billsAdapterList.add(bill);
        billsAdapterList.add(bill2);
        billsAdapterList.add(bill3);
        billsAdapterList.add(bill4);
        billsAdapterList.add(bill5);
        billsAdapterList.add(bill6);
        billsAdapterList.add(bill7);
        billsAdapterList.add(bill8);
        billsAdapterList.add(bill9);
        billsAdapterList.add(bill10);
        billsAdapterList.add(bill11);
        billsAdapterList.add(bill12);
        billsAdapterList.add(bill13);
        ArrayList<Bill> billslist = billsAdapterList.getList();

        hashMap.put(1, customersList);
        hashMap.put(2, itemsList);
        hashMap.put(3, companiesList);
        hashMap.put(4, billslist);


        return hashMap;

    }


}

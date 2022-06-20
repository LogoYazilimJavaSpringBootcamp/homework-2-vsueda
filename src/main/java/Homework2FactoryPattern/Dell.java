package Homework2FactoryPattern;

import Homework1Adapter.ItemAdapter;
import Homework1Model.Item;

public class Dell implements IComputer{
    private Item item;
    private String color;
    private String properties;

    public Dell(Item item, String color, String properties) {
        item = (Item) new ItemAdapter().getId(item.getItemId());
        this.item = item;
        this.color = color;
        this.properties = properties;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public Integer getPrice() {
        return item.getItemPrice();
    }

    @Override
    public String getProperties() {
        return properties;
    }

    @Override
    public void showComputer() {
        System.out.println("Bilgisayar Adi: Dell");
        System.out.println("Bilgisayar Rengi: "+color);
        System.out.println("Bilgisayar Fiyati: " +item.getItemPrice());
        System.out.println("Bilgisayar Ozellikleri: 8gb Ram, 256gb SSD, 15");
    }


}

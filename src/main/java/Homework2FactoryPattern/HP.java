package Homework2FactoryPattern;

import Homework1Adapter.ItemAdapter;
import Homework1Model.Item;

public class HP implements IComputer{
    private Item item;
    private String color;
    private String properties;

    public HP(Item item, String color, String properties) {
        item = (Item) new ItemAdapter().getId(item.getItemId());
        this.item = item;
        this.color = color;
        this.properties = properties;
    }

    @Override
    public String getColor() {
        return null;
    }

    @Override
    public Integer getPrice() {
        return null;
    }

    @Override
    public String getProperties() {
        return null;
    }

    @Override
    public void showComputer() {

    }
}

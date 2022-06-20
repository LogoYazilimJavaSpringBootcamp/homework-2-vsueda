package Homework2SingletonPattern;

public class Order {
    private static Order order;

    public Order() {
        System.out.println("Siradasiniz");
    }

    public static Order getOrder(){
        if(order == null) {
            order = new Order();
        }
        else{
            System.out.println("Sira kullanimda");
        }
        return order;
    }

}
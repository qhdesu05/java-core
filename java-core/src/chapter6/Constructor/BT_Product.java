package chapter6.Constructor;

public class BT_Product {
    String name;
    double price;

    public BT_Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    void display() {
        System.out.println(this.name + " - " + this.price);
    }
}

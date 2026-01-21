package chapter6.Constructor;

public class BT_Constructor {
    static void main(String[] args) {
        BT_Product product1 = new BT_Product("Laptop", 1800);
        BT_Product product2 = new BT_Product("iPhone", 3600);

        product1.display();
        System.out.println("-----------------");
        product2.display();
    }
}

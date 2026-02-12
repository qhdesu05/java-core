package chapter11.BT_HashSet;

import java.util.HashSet;

public class main {
    static void main(String[] args) {
        Product pr1 = new Product(1, "Laptop", 1500);
        Product pr2 = new Product(2, "Mouse", 20);
        Product pr3 = new Product(3, "Keyboard", 45);
        Product pr4 = new Product(1, "Laptop Pro", 2000);
        Product pr5 = new Product(1, "Laptop", 1500);

        HashSet<Product> products = new HashSet<>();
        products.add(pr1);
        products.add(pr2);
        products.add(pr3);
        products.add(pr4);
        products.add(pr5);

        products.remove(pr3);

        for (Product product : products) {
            System.out.println(product);
        }


    }
}

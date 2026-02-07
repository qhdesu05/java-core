package chapter8.Upcasting_Downcasting_instanceof;

public class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }

    void wagTail() {
        System.out.println("Wagging tail....");
    }
}

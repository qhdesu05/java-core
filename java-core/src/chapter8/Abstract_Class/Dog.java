package chapter8.Abstract_Class;

public class Dog extends Animal {

    @Override
    void makeSound() {
        System.out.println("dog is go go");
    }

    @Override
    void isHandSome() {
        System.out.println("bla bla....");
    }
}

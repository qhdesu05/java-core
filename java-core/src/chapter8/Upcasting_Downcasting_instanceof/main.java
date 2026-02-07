package chapter8.Upcasting_Downcasting_instanceof;

public class main {
    static void main(String[] args) {
        Animal a = new Animal();
        Dog myDog = new Dog();

        Animal test = new Dog(); // upcasting
        Dog test2 = (Dog) test; //downcasting
        test.makeSound();
        test2.wagTail();
//        System.out.println(test.getClass()); //runtime
//        Dog test2 = new Animal(); sai
    }
}

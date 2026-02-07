package chapter8.Interface;

public class Bird implements Flyable, Animal {

    @Override
    public void doFly() {
        System.out.println("Chim bay bang canh");
    }

    @Override
    public void makeSound() {
        
    }
}

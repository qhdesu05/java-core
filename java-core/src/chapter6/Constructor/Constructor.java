package chapter6.Constructor;

public class Constructor {
    static void main(String[] args) {
        Student st1 = new Student("qh", 36);
        Student st2 = new Student("th", 18);
        System.out.println("name = " + st1.name);
        System.out.println("name = " + st2.name);
    }
}

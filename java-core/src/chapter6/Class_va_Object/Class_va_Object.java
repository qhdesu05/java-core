package chapter6.Class_va_Object;

public class Class_va_Object {
    static void main(String[] args) {
        Student sv1 = new Student();
        sv1.age = 36;
        sv1.name = "qh";

        System.out.println("Info sv1, age= " + sv1.age + " name= " + sv1.name);

        sv1.learnJava();

        Student sv2 = new Student();
        sv2.age = 18;
        sv2.name = "thanhhoa";
    }
}

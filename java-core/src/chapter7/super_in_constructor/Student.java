package chapter7.super_in_constructor;

public class Student extends Person {
    String school;

    public Student(String school, String name, int age) {
        super(name, age);

        this.school = school;
    }

    public void printInfo() {
        System.out.println(" Student: " + this.school);
    }

    public void test() {
        this.printInfo();
        super.printInfo();
    }
}

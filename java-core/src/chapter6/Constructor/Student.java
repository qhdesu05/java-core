package chapter6.Constructor;

public class Student {
    String name;
    int age;


    public Student(String name_, int age_) {
        this.name = name_;
        this.age = age_;
    }

    void learnJava() {
        System.out.println("run learn java");
    }
}

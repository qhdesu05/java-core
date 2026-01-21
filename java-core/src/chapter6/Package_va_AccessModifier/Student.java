package chapter6.Package_va_AccessModifier;

public class Student {
    String name;
    String mssv;

    public Student(String name, String mssv) {
        this.name = name;
        this.mssv = mssv;
    }

    void display() {
        System.out.println(this.name + " - " + this.mssv);
    }
}

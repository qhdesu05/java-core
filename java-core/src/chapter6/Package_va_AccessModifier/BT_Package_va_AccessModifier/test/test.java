package chapter6.Package_va_AccessModifier.BT_Package_va_AccessModifier.test;

import chapter6.Package_va_AccessModifier.BT_Package_va_AccessModifier.modal.Employee;

public class test {
    static void main(String[] args) {
        Employee nv1 = new Employee();
//        nv1.name = "qh"; //private
//        nv1.age = 36; //default =>  same package
        nv1.salary = 10000.36;
        nv1.sum(3, 6);
    }
}

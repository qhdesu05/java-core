package chapter6.Package_va_AccessModifier.BT_Package_va_AccessModifier.modal;

public class SameTest {
    static void main(String[] args) {
        Employee nv1 = new Employee();
//        nv1.name = "qh"; //private
        nv1.age = 36; //default =>  same package
    }
}

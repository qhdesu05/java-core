package chapter9.Inner_Class_va_Nested_Class;

public class main {
    static void main(String[] args) {
        Person qh = new Person("qh", 36);

//        Person.UserID myData = qh.new UserID("363636", "hanoi");
        Person.UserID myData = new Person.UserID("363636", "hanoi");
        System.out.println("check person name = " + qh.getName());
        System.out.println("check person cccd= " + myData.getID());
//        myData.printInfo();
    }
}

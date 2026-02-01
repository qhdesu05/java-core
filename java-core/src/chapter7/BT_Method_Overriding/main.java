package chapter7.BT_Method_Overriding;

public class main {
    static void main(String[] args) {
        Manager boss = new Manager("IT", "QH", 36, 18000.18);
        Programmer dev = new Programmer("TH", 18, 18000.18);

        System.out.println("boss salary: " + boss.calculateSalary());
        System.out.println("dev salary: " + dev.calculateSalary());
    }
}

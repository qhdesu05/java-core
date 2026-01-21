package chapter6.Lab04.lab04;

import chapter6.Lab04.modal.Employee;

public class lab04 {
    static void main(String[] args) {
        Employee nv1 = new Employee("quang hoang", 36, "IT", 8000);
        nv1.setCompany("fpt");
        Employee nv2 = new Employee("thanh hoa", 18, "Sales", 3600);


        System.out.println("== BEFORE RAISE ==");
        nv1.showInfo();
        System.out.println("------------------------------------");
        nv2.showInfo();

        System.out.println();
        System.out.println("== AFTER RAISE ==");
        nv1.raiseSalary(0);
        nv1.showInfo();
        System.out.println("------------------------------------");
        nv2.raiseSalary(1);
        nv2.showInfo();
    }
}

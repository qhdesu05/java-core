package chapter8.BT_Abstract_Class;

public class main {
    static void main(String[] args) {
        FullTimeEmployee fulltime = new FullTimeEmployee(3000, "quanghoang", "IT");
        PartTimeEmployee parttime = new PartTimeEmployee(4, 1500, "IT", "IT");

        Employee[] listEmployee = {fulltime, parttime};
        for (Employee employee : listEmployee) {
            employee.printInfo();
            System.out.println("Salary: " + employee.calculateSalary());
            System.out.println();
        }
    }
}

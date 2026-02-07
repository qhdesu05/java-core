package chapter8.BT_Abstract_Class;

public class FullTimeEmployee extends Employee {
    private double monthlySalary;

    public FullTimeEmployee(double monthlySalary, String name, String department) {
        super(name, department);
        this.monthlySalary = monthlySalary;
    }

    @Override
    double calculateSalary() {
        return this.monthlySalary;
    }

    @Override
    public void printInfo() {
        System.out.println("Name: " + super.getName() + " | Department " + super.getDepartment() + " | Type: Full-time");
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }
}

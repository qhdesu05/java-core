package chapter7.BT_Method_Overriding;

public class Manager extends Employee {
    private String department;

    public Manager(String department, String name, int id, double salary) {
        super(name, id, salary);
        this.department = department;
    }

    @Override
    double calculateSalary() {
        double currentSalary = super.calculateSalary();
        return currentSalary * 1.1;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}

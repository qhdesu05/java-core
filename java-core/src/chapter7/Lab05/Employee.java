package chapter7.Lab05;

public class Employee extends Person {
    private int employeeId;
    private double salary;

    public Employee(int employeeId, double salary, String name, String age) {
        super(name, age);
        this.employeeId = employeeId;
        this.salary = salary;
    }

    @Override
    public void introduce() {
        super.introduce();
        System.out.println("employeeId: " + this.employeeId);
        System.out.println("salary: " + this.salary);
    }

    public double calculateSalary() {
        return this.salary;
    }

    public double calculateSalary(double bonus) {
        return this.salary + bonus;
    }


    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

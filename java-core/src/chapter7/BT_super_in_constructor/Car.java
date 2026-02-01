package chapter7.BT_super_in_constructor;

public class Car extends Vehicle {
    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Car(String type, String brand, String year) {
        super(brand, year);
        this.type = type;
        System.out.println("run constructor form Car");
    }

    public void printInfo() {
        super.printInfo();
        System.out.println("Car: " + this.type);
    }
}

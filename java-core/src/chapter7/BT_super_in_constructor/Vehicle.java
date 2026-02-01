package chapter7.BT_super_in_constructor;

public class Vehicle {


    private String brand;
    private String year;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public Vehicle(String brand, String year) {
        this.brand = brand;
        this.year = year;
        System.out.println("run constructor form Vehicle");
    }

    public void printInfo() {
        System.out.println("Vehicle: " + this.brand + " , " + this.year);
    }
}

package chapter8.BT_Tinh_Da_Hinh;

public class Car extends Vehicle {
    @Override
    public void start() {
        System.out.println("Car " + super.getBrand() + " is starting....");
    }

    public Car(String brand) {
        super(brand);
    }
}

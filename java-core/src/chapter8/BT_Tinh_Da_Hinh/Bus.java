package chapter8.BT_Tinh_Da_Hinh;

public class Bus extends Vehicle {
    @Override
    public void start() {
        System.out.println("Bus " + super.getBrand() + " is starting....");
    }

    public Bus(String brand) {
        super(brand);
    }
}

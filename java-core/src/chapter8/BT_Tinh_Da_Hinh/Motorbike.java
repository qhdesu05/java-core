package chapter8.BT_Tinh_Da_Hinh;

public class Motorbike extends Vehicle {
    @Override
    public void start() {
        System.out.println("Motorbike " + super.getBrand() + " is starting....");
    }

    public Motorbike(String brand) {
        super(brand);
    }
}

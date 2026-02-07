package chapter8.BT_Tinh_Da_Hinh;

public class main {

    static void main(String[] args) {
        Car myCar = new Car("toyota");
        Bus myBus = new Bus("vin");
        Motorbike myMotor = new Motorbike("honda");

//        Vehicle[] phuongTien = new Vehicle[3];
//        phuongTien[0] = myCar;
//        phuongTien[1] = myBus;
//        phuongTien[2] = myMotor;

        Vehicle[] phuongTien = {myCar, myBus, myMotor};

        for (Vehicle vehicle : phuongTien) {
            vehicle.start(); //run time
        }
    }
}

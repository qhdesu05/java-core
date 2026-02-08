package chapter9.Lab07;

public class main {
    static void main(String[] args) {
        Runnable task = new Runnable() {
            @Override
            public void run() {
                OrderStatus myStatus = OrderStatus.PENDING;

                Order myOrder = new Order("C001", myStatus);
                myOrder.processOrder();
                Order.CustomerInfo data = myOrder.new CustomerInfo("QH", "123456789");
                data.printInfo();

                Order.DiscountHelper od = new Order.DiscountHelper();
                System.out.println("chiet khau ap dung: " + od.calculateDiscount(myStatus));
                System.out.println("Don hang " + myOrder.getId() + " dang duoc xu ly o trang thai: " + myStatus.getDescription());
            }
        };
        task.run();
    }
}

package chapter9.BT_Enum;

import java.util.Scanner;

public class main {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap trang thai don hang: ");
        String status = sc.nextLine().toUpperCase();

        try {
            OrderStatus input = OrderStatus.valueOf(status);
            System.out.println("Trang thai: " + input.getStatus());
            System.out.println("Trang thai cuoi cung: " + input.hasFinal());
        } catch (Exception e) {
            System.out.println("Trang thai khong hop le!");
            return;
        }
        System.out.println("Status = " + status);

    }
}

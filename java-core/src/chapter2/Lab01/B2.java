package chapter2.Lab01;

import java.util.Scanner;

public class B2 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào chiều dài của hình chữ nhật: ");
        float chieuDai = scanner.nextFloat();

        System.out.println("Nhập vào chiều rộng của hình chữ nhật: ");
        float chieuRong = scanner.nextFloat();

        float chuVi = (chieuDai+chieuRong)*2;
        float dienTich = chieuDai*chieuRong;

        float canhMin = Math.min(chieuDai,chieuRong);
        System.out.println("===========================");

        System.out.println("chu vi= "+ chuVi);
        System.out.printf("dien tich= %.3f", dienTich);
        System.out.println();
        System.out.println("canh min= "+ canhMin);
        scanner.close();
    }
}

package chapter2_3.Lab01;

import java.util.Scanner;

public class B3 {
    static void main(String[] args) {
        System.out.println("Nhập vào cạnh của hình lâp phương: ");
        Scanner scanner = new Scanner(System.in);

        float canh = scanner.nextFloat();
        double theTich = Math.pow(canh,3);
        System.out.println("=================================");
        System.out.println("Thể tích hình lâp phương: "+ theTich);
    }
}

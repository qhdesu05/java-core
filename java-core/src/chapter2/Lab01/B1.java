package chapter2.Lab01;

import java.util.Scanner;

public class B1 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap vao diem sinh vien: ");
        float score = scanner.nextFloat();

        scanner.nextLine(); //doc bo dong thua

        System.out.println("Nhap vao ten sinh vien: ");
        String name = scanner.nextLine();

        System.out.println("-----------------------");
        System.out.println(name+" co diem la: " + score);
        scanner.close();
    }
}

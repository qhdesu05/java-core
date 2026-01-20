package chapter5.Lab03;

import java.util.Scanner;

public class Lab03 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//          Nhap vao ten va diem cua 3 hoc sinh.
//          Luu ten vao mang String[], diem vao mang double[]
//          In ra danh sach hoc sinh va diem tuong ung
//          tinh va in ra diem trung binh cua ca lop
//          In ra hoc sinh co diem tu 8 tro len

        String[] names = new String[3];
        double[] scores = new double[3];

        for (int i = 1; i <= 3; i++) {
            System.out.println("Nhap vao ten hoc sinh " + i + ":");
            String name = scanner.nextLine();
            names[i - 1] = name;

            System.out.println("Nhap vao diem hoc sinh " + i + ":");
            double score = scanner.nextDouble();
            scores[i - 1] = score;

            scanner.nextLine();
        }
        System.out.println("-------------------");
        System.out.println("Danh sach da nhap: ");
        double sum = 0;
        for (int i = 1; i <= 3; i++) {
            System.out.println("Ten: " + names[i - 1] + " va diem= " + scores[i - 1]);

            sum += scores[i - 1];
        }
        System.out.printf("Diem trung binh: %.2f", sum / 3);
        System.out.println();
        System.out.println("Diem lon hon 8: ");
        for (int i = 1; i <= 3; i++) {
            if (scores[i - 1] >= 8) {
                System.out.println("Ten= " + names[i - 1] + " va diem = " + scores[i - 1]);
            }
        }
        scanner.close();
    }
}

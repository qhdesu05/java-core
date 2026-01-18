package chapter4.Lab02;

import java.util.Scanner;

public class Lab02 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float score = 0;
        int count = 0;
        float sum = 0;
        do {
            System.out.println("Nhap diem tu ban phim (0->10): ");
            score = scanner.nextFloat();
            if (score == -1) break;
            if (score < 0 || score > 10) {
                System.out.println("gia tri " + score + " khong hop le");
                continue;
            }
            count++;
            sum += score;

        } while (score != -1);
        System.out.println("====MENU====");
        System.out.println("1. tinh diem trung binh");
        System.out.println("2. phan loai hoc luc");
        System.out.println("3. thoat chuong trinh");
        System.out.println("=================");
        System.out.println("nhap lua chon: ");

        float diemTB = (float) sum / count;
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                System.out.println("ban da lua chon tinh diem trung binh");
                System.out.println("-----------");
                System.out.printf("diem trung binh= %.2f", diemTB);
                break;
            case 2:
                System.out.println("ban da lua chon tinh loai hoc luc");
                System.out.println("-----------");
                if (diemTB >= 9 && diemTB <= 10) {
                    System.out.println("xuat sac");
                } else if (diemTB >= 8 && diemTB < 9) {
                    System.out.println("gioi");
                } else if (diemTB >= 6.5 && diemTB < 8) {
                    System.out.println("kha");
                } else if (diemTB >= 5 && diemTB < 6.5) {
                    System.out.println("trung binh");
                } else if (diemTB >= 0 && diemTB < 5) {
                    System.out.println("yeu");
                } else System.out.println("diem trung binh " + diemTB + " khong hop le");


                break;
            case 3:
                break;
            default:
                break;
        }
        System.out.println("ket thuc chuong trinh");

        scanner.close();
    }
}
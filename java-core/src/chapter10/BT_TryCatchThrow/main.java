package chapter10.BT_TryCatchThrow;

import java.util.Scanner;

public class main {
    public static void checkScore(int score) {
        if (score < 0 || score > 10) {
            throw new IllegalArgumentException("Diem khong hop le: phai tu 0 den 10");
        }
        System.out.println("diem cua ban la: " + score);
    }

    static void main(String[] args) {
        //cach 1
//        Scanner sc = new Scanner(System.in);
//        System.out.println("nhap vao diem so: ");
//        int input = sc.nextInt();
//        try {
//            checkScore(input);
//        } catch (IllegalArgumentException e) {
//            System.out.println("Error= " + e.getMessage());
//        } finally {
//            System.out.println("Ket thuc chuong trinh.");
//        }
//        sc.close();

        //cach 2: try with resources
        System.out.println("nhap vao diem so: ");

        try (Scanner sc = new Scanner(System.in);) {
            int input = sc.nextInt();
            checkScore(input);
        } catch (IllegalArgumentException e) {
            System.out.println("Error= " + e.getMessage());
        } finally {
            System.out.println("Ket thuc chuong trinh.");
        }
    }
}

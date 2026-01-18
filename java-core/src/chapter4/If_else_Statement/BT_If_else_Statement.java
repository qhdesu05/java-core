package chapter4.If_else_Statement;

import java.util.Scanner;

public class BT_If_else_Statement {
    static void main(String[] args) {
        System.out.println("nhap vao diem cua ban: ");
        Scanner scanner = new Scanner(System.in);
        float score = scanner.nextFloat();

        if (score >= 9 && score <= 10) {
            System.out.println("xuat sac");
        } else if (score >= 8 && score < 9) {
            System.out.println("gioi");
        } else if (score >= 6.5 && score < 8) {
            System.out.println("kha");
        } else if (score >= 5 && score < 6.5) {
            System.out.println("trung binh");
        } else if (score >= 0 && score < 5) {
            System.out.println("yeu");
        } else System.out.println("khong hop le");

        scanner.close();
    }
}

package chapter5.Array1D;

import java.util.Scanner;

public class BT_Array1D {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] listNumber = new int[5];

        for (int i = 1; i <= 5; i++) {
            System.out.println("nhap phan tu" + i + ":");
            int input = scanner.nextInt();
            listNumber[i - 1] = input;
        }
        int sum = 0;
        int max = 0;
        for (int j = 0; j < listNumber.length; j++) {
            sum += listNumber[j];

            if (max < listNumber[j]) {
                max = listNumber[j];
            }
        }
        System.out.println("-------------------");
        System.out.println("tong cac so vua nhap= " + sum);
        System.out.println("so lon nhat= " + max);

        scanner.close();
    }
}

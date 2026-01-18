package chapter4.Loop_for_while_do_while;

import java.util.Scanner;

public class BT_Loop_for_while_do_while {
    static void main(String[] args) {
        //yeu cau 1
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        System.out.println("sum= " + sum);

        //yeu cau 2: in so chan tu 2 den 20(dung while)
        int j = 2;
        while (j <= 20) {
            if (j % 2 == 0) System.out.println("day la so chan " + j);
            j++;
        }

        //yeu cau 3:
        Scanner scanner = new Scanner(System.in);
        String password = "quanghoang36";

        String input = "";
        do {
            System.out.println("Nhap mat khau: ");
            input = scanner.nextLine();
        } while (!password.equals(input));

        System.out.println("da nhap dung");


        scanner.close();
    }
}

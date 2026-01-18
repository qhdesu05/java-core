package chapter4.switch_case_Statement;

import java.util.Scanner;

public class BT_switch_case_Statement {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so tu 1 toi 7: ");
        int day = scanner.nextInt();
        System.out.println("-------------------------");
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day number!");
                break;

        }
        scanner.close();
    }
}

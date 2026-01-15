package chapter2;
import java.util.Scanner;
public class HelloWorld {
    public static void main(String[] args) {
        String name = "qh";
        double pi = 3.141516;
        System.out.println("my name is: "+name);

        System.out.print("quang hoang");
        System.out.printf("co pi = %.2f",pi);
        System.out.println(" que thanh hoa");

        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        System.out.print("age= "+age);
    }
}

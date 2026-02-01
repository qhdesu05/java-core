package chapter7.Method_Overloading;

public class Method_Overloading {
    public static int sum(int a, int b) {
        return a + b;
    }

    public static double sum(double a, double b) {
        return a + b;
    }

    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    static void main(String[] args) {
        System.out.println("sum= " + sum(6, 9));
        System.out.println("sum= " + sum(6.1, 9.1));
        System.out.println("sum= " + sum(6, 9, 6));
    }
}

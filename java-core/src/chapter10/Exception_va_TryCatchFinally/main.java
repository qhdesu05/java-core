package chapter10.Exception_va_TryCatchFinally;

public class main {
    static void main(String[] args) {
        int a = 10;
        int b = 0;

        try {
            System.out.println("a/b= " + a / b);
        } catch (Exception e) {
            System.out.println("run catch: " + e.getMessage());
        } finally {
            System.out.println("run finally");
        }


        System.out.println("end game");
    }
}

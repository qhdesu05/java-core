package chapter10.throw_va_throws;

public class main {
    public static int chia2songuyen(int a, int b) throws Exception {
        if (b == 0) {
            throw new Exception("loi chia cho 0");
        }
        return a / b;
    }

    public static void main(String[] args) throws Exception {
        System.out.println("ket qua chia= " + chia2songuyen(10, 2));
    }
}

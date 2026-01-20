package chapter5.sosanhbangbangvoiequals;

public class sosanhbangbangvoiequals {
    static void main() {
        String a = "hello";
        String b = new String("hello");
        int c = 10;
        int d = 10;


        System.out.println(a == b); //kieu du lieu tham chieu
        System.out.println(a.equals(b));

        System.out.println(c == d); //kieu du lieu nguyen thuy
    }
}

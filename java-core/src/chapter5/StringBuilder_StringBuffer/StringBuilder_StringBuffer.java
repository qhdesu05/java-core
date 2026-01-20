package chapter5.StringBuilder_StringBuffer;

public class StringBuilder_StringBuffer {
    static void main(String[] args) {
        String s = "";
        for (int i = 0; i < 1000; i++) {
            s += i;

        }
        System.out.println(s);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 1000; i++) {
            sb.append(i);

        }
        System.out.println(sb.toString());
    }
}

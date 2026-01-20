package chapter5.Strings;

public class Stringz {
    static void main(String[] args) {
        String name = "quang Hoang";
        System.out.println("length: " + name.length());
        System.out.println("length: " + name.toUpperCase());
        System.out.println("length: " + name.toLowerCase());
        System.out.println(name.charAt(1));
        System.out.println(name.contains("oang"));
        System.out.println(name.substring(0, 3));
    }
}

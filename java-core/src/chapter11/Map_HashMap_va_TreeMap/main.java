package chapter11.Map_HashMap_va_TreeMap;

import java.util.HashMap;
import java.util.TreeMap;

public class main {
    public static void hashMapExample() {
        System.out.println("hashMapExample");
        HashMap<Integer, String> students = new HashMap<>();
        students.put(1, "qh");
        students.put(2, "th");
        students.put(3, "bla bla");
        students.put(1, "qh update");
        System.out.println(students);
    }

    public static void treeMapExample() {
        System.out.println("treeMapExample");
        TreeMap<Integer, String> students2 = new TreeMap<>();
        students2.put(1, "qh");
        students2.put(5, "th");
        students2.put(20, "bla bla");
        students2.put(3, "qh update");
        System.out.println(students2);
    }

    static void main(String[] args) {
        hashMapExample();
        treeMapExample();
    }
}

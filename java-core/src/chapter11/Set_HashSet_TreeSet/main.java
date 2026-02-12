package chapter11.Set_HashSet_TreeSet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

public class main {
    public static void hashSetExample() {
        System.out.println("run hashSet");
        HashSet<String> qh = new HashSet<>();
        HashSet<Integer> numberHashSet = new HashSet<>();

        numberHashSet.add(10);
        numberHashSet.add(4);
        numberHashSet.add(20);
        numberHashSet.add(3);


        ArrayList<String> qhArr = new ArrayList<>();

        qh.add("javascrip");
        qh.add("java");
        qh.add("backend");
        qh.add("javascrip");

        qhArr.add("javascrip");
        qhArr.add("java");
        qhArr.add("backend");
        qhArr.add("javascrip");

        System.out.println(qh);
        System.out.println("arraylist: " + qhArr);
        System.out.println(numberHashSet);
    }

    public static void treeSetExample() {
        System.out.println("run treeSet");
        HashSet<Integer> numberTreeSet = new HashSet<>();
        TreeSet<Integer> numberTreeSet2 = new TreeSet<>();

        numberTreeSet.add(10);
        numberTreeSet.add(4);
        numberTreeSet.add(20);
        numberTreeSet.add(3);

        numberTreeSet2.add(10);
        numberTreeSet2.add(4);
        numberTreeSet2.add(20);
        numberTreeSet2.add(3);

        System.out.println(numberTreeSet);
        System.out.println(numberTreeSet2);
    }

    static void main(String[] args) {
        hashSetExample();
        treeSetExample();
    }
}

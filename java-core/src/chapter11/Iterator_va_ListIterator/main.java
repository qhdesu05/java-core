package chapter11.Iterator_va_ListIterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class main {
    public static void iteratorExample() {
        ArrayList<String> languages = new ArrayList<>();
        languages.add("Java");
        languages.add("C#");
        languages.add("PHP");
        languages.add("C++");
        languages.add("JavaScrip");

        Iterator<String> languagesIterator = languages.iterator();
        while (languagesIterator.hasNext()) {
            String lang = languagesIterator.next();
            if (lang.equals("C#")) {
                languagesIterator.remove();
            }
        }

        for (String lang : languages) {
            System.out.println(lang);
        }
    }

    public static void listIteratorExample() {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(10);
        nums.add(100);
        nums.add(2);
        nums.add(15);
        nums.add(3);

        ListIterator<Integer> li = nums.listIterator();

        System.out.println("duyet xuoi: ");
        while (li.hasNext()) {
            System.out.print(li.next() + " - ");
        }
        System.out.println();
        System.out.println("duyet nguoc: ");
        while (li.hasPrevious()) {
            System.out.print(li.previous() + " - ");

        }
        System.out.println();
        //them phan tu 25 vao sau 100
        li = nums.listIterator();
        while (li.hasNext()) {
            if (li.next() == 100) {
                li.add(25); //them sau 100
            }
        }
        System.out.println("sau khi them 25: " + nums);
    }

    static void main(String[] args) {
//        ArrayList<String> languages = new ArrayList<>();
//        languages.add("Java");
//        languages.add("C#");
//        languages.add("PHP");
//        languages.add("C++");
//        languages.add("JavaScrip");
//
//        for (String language : languages) {
//            if (language.equals("C#")) {
//                languages.remove(language);
//            }
//        }

        iteratorExample();
        listIteratorExample();
    }
}

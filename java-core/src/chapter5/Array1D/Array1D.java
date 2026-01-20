package chapter5.Array1D;

public class Array1D {
    static void main(String[] args) {
        int[] qh = {10, 2, 6, 7, 1};
        System.out.println("phan tu dau tien = " + qh[0]);
        System.out.println("phan tu dau tien = " + qh[3]);
        System.out.println("phan tu dau tien = " + qh.length);

        String[] names = {"le van a", "bla bla", "qh"};
        for (int i = 0; i < names.length; i++) {
            System.out.println("phan tu" + i + " = " + names[i]);
        }
    }
}

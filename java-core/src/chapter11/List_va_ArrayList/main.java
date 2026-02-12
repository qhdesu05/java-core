package chapter11.List_va_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class main {
    static void main(String[] args) {
        ArrayList<String> qh = new ArrayList<>();
        qh.add("ha noi"); //["hanoi]
        qh.add("hcm"); //["hanoi","hcm"]
        qh.add("da nang"); //["hanoi","hcm","da nang"]
        qh.add("ha noi"); //["hanoi","hcm","da nang","ha noi"]

        for (String city : qh) {
            System.out.println(city);
        }

        List<String> qh2 = new ArrayList<>(); //upcasting
    }
}

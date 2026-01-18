package chapter4.break_continue_return_Statement;

public class BT_break_continue_return_Statement {
    static void main(String[] args) {
        //yeu cau 1: tim so dau tien (thu 3) chia het cho 7 trong day so tu 1 den 100
        //goi y: duyet tu 1-> 100, in ra so dau tien chia het cho 7 roio dung lai (dung break).
        for (int i = 1; i <= 100; i++) {
            if (i % 7 == 0) {
                System.out.println("i=  " + i);
                break;
            }
        }
        int count = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 7 == 0) {
                count++;
                if (count == 3) {
                    System.out.println("i thu 3 =   " + i);
                    break;
                }
            }
        }


        //yeu cau2:in cac so tu 1 den 10, bo qua so le(dung continue)
        //goi y: neu i%2 !=0 thi continue
        for (int j = 1; j <= 10; j++) {
            if (j % 2 != 0)
                continue;
            System.out.println("j= " + j);
        }
    }
}

package chapter5.For_each;

public class BT_For_each {
    static void main(String[] args) {
        double[] scores = {8, 10, 6.5, 7, 1, 3.5};

        double sum = 0, diemTB = 0;
        for (double score : scores) {
            sum += score;
        }
        System.out.println("Tong diem= " + sum);
        diemTB = sum / (scores.length);
        System.out.println("Diem trung binh= " + diemTB);
    }
}

package chapter4.If_else_Statement;

public class If_else_Statement {
    static void main(String[] args) {
        int score = 8;
        if (score >= 9) {
            System.out.println("ban da dat xuat sac");
        } else if (score >= 8 && score < 9) {
            System.out.println("ban dat gioi");
        } else if (score >= 7 && score < 8) {
            System.out.println("ban dat kha");
        } else System.out.println("ban dat trung binh");
    }
}

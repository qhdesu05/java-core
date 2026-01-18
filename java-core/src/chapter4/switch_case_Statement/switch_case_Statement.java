package chapter4.switch_case_Statement;

public class switch_case_Statement {
    static void main(String[] args) {
        int day = 3;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            default:
                System.out.println("Another day");
        }
//java 12 tro len
        String result = switch (day) {
            case 1 -> "monday";
            case 2 -> "tuesday";
            default -> "another day";
        };
        System.out.println("java 12 tro len: " + result);

    }
}

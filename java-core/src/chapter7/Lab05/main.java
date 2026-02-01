package chapter7.Lab05;

public class main {
    static void main(String[] args) {
        Manager boss = new Manager("IT", 36, 36000, "QH", "21");
        boss.introduce();

        System.out.println();
        System.out.println("luong co ban: " + boss.calculateSalary());
        System.out.println("luong sau thuong: " + boss.calculateSalary(500));
    }
}

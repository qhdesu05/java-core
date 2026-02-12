package chapter11.BT_ArrayList;

import java.util.ArrayList;

public class main {
    static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();

        Student st1 = new Student("qh", 36);
        Student st2 = new Student("th", 18);
        Student st3 = new Student("jv", 14);

        students.add(st1);
        students.add(st2);
        students.add(st3);
        //[st1,st2,st3]

        for (Student student : students) {
            System.out.println("Name = " + student.getName() + " ,age= " + student.getAge());
        }

        System.out.println("=================");
        //them vao index = 1;
        //[st1,st4,st2,st3]
        Student st4 = new Student("insert index = 1", 20);
        students.add(1, st4);
        for (Student student : students) {
            System.out.println("Name = " + student.getName() + " ,age= " + student.getAge());
        }

        //xoa index = 0
        System.out.println("=================");
        students.remove(0);
        for (Student student : students) {
            System.out.println("Name = " + student.getName() + " ,age= " + student.getAge());
        }
    }
}

package chapter6.Encapsulation;

public class Encapsulation {
    static void main(String[] args) {
        Student st = new Student("qh", "F");
        st.setName("update name by setter");
        System.out.println("name= " + st.getName());
    }
}

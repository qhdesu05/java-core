package chapter9.final_va_static;

public class main {
    static void main(String[] args) {
        Student st = new Student();
//        st.country = "HANOI";
        System.out.println("check country = " + st.country);

//        st.printInfo();
        Student.printInfo(); //thao tac truc tiep qua class

    }
}

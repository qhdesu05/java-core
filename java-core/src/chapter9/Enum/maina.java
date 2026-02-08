package chapter9.Enum;

public class maina {
    static void main(String[] args) {
        System.out.println("my role = " + Role.ADMIN);
        System.out.println("my role with enum = " + myRole.ADMIN);

        myRole test = myRole.ADMIN;
//        myRole test1 = "SUPERADMIN"; //string
    }
}

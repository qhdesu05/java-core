package chapter7.BT_Method_Overloading;

public class main {
    static void main(String[] args) {
        CustomerPrinter cp = new CustomerPrinter();
        cp.print("qh");
        cp.print("th", 36);
        cp.print("desu", 18, "jp");
    }
}

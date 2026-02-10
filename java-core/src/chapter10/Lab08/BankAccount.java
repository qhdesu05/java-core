package chapter10.Lab08;

public class BankAccount {
    private String username;
    private String password;
    private double balance;

    public BankAccount(String username, String password, double balance) {
        this.username = username;
        if (password.length() < 6) {
            throw new WeekPasswordException("Mat khau phai co it nhat 6 ky tu ");
        }
        this.password = password;
        this.balance = balance;
    }

    public void withdraw(double ammout) throws NegativeBalanceException {
        if (ammout > this.balance) {
            throw new NegativeBalanceException("khong du so du de rut tien ");
        }

        double newBalance = this.balance - ammout;
        this.setBalance(newBalance);
        System.out.println("rut tien thanh cong. So du con lai: " + newBalance);
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

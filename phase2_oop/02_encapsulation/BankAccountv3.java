public class BankAccountv3 {
    private double balance;

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance = balance + amount;
    }

    public void withdraw(double amount) {
        balance = balance - amount;
    }

    public static void main(String[] args) {
        BankAccountv3 account = new BankAccountv3();
        System.out.println(account.getBalance());
        account.deposit(50);
        System.out.println(account.getBalance());
        account.withdraw(23);
        System.out.println(account.getBalance());
    }
}

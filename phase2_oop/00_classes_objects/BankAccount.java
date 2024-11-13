public class BankAccount {
    double balance;

    public void deposit(double amount) {
        balance = balance + amount;
    }

    public void withdraw(double amount) {
        balance = balance - amount;
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        System.out.println(account.balance);
        account.deposit(50);
        System.out.println(account.balance);
        account.withdraw(23);
        System.out.println(account.balance);
    }
}

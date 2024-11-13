import java.util.Scanner;

public class BankAccountv2 {
    double balance;

    public void deposit(double amount) {
        balance = balance + amount;
    }

    public void withdraw(double amount) {
        balance = balance - amount;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccountv2 account = new BankAccountv2();
        System.out.println("How much would you like to deposit?");
        account.deposit(sc.nextDouble());
        System.out.println("Your current balance is:: " + account.balance);
        System.out.println("How much would you like to withdraw?");
        account.withdraw(sc.nextDouble());
        System.out.println("Your current balance is:: " + account.balance);
    }
}

public class BankAccountv3 {
    private double balance;

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful! Current balance: " + balance);
        } else {
            System.out.println("Invalid deposit amount! The amount must be positive.");
        }
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount! The amount must be positive.");
        } else if (amount > balance) {
            System.out.println("Insufficient funds! Unable to withdraw this amount: " + amount);
        } else {
            balance -= amount;
            System.out.println("Withdrawal of " + amount + " successful! Current balance: " + balance);
        }
    }

    public static void main(String[] args) {
        BankAccountv3 account = new BankAccountv3();
        account.setBalance(100);

        System.out.println("Initial balance: " + account.getBalance());

        account.deposit(50);
        account.deposit(-10);

        account.withdraw(30);
        account.withdraw(150);
        account.withdraw(-20);
    }
}

import java.text.NumberFormat;

public class BankAccount {

    private String accountHolder;
    private double balance;

    public BankAccount(String accountHolder, double initialBalance) {
        this.accountHolder = accountHolder;
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Deposit amount must be positive.");
            return;
        }
        balance += amount;
        NumberFormat f = NumberFormat.getCurrencyInstance();
        System.out.println("Deposited " + f.format(amount) + ". New balance: " + f.format(balance));
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Withdrawal amount must be positive.");
            return;
        }
        if (amount > balance) {
            NumberFormat f = NumberFormat.getCurrencyInstance();
            System.out.println("Insufficient funds! Balance: " + f.format(balance));
            return;
        }
        balance -= amount;
        NumberFormat f = NumberFormat.getCurrencyInstance();
        System.out.println("Withdrew " + f.format(amount) + ". New balance: " + f.format(balance));
    }

    public double getBalance() {
        return balance;
    }

    public String getFormattedBalance() {
        NumberFormat f = NumberFormat.getCurrencyInstance();
        return f.format(balance);
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void printSummary() {
        NumberFormat f = NumberFormat.getCurrencyInstance();
        System.out.println("--- Account Summary ---");
        System.out.println("Holder: " + accountHolder);
        System.out.println("Balance: " + f.format(balance));
    }
}
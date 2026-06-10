import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Get the user's name
        System.out.print("Enter account holder name: ");
        String name = scanner.nextLine();

        // Get starting balance
        System.out.print("Enter initial balance: $");
        double initialBalance = scanner.nextDouble();

        // Create the account
        BankAccount myAccount = new BankAccount(name, initialBalance);

        System.out.println("\nAccount created successfully!");

        // Menu loop - keeps running until user types 5
        int choice = 0;
        while (choice != 5) {

            System.out.println("\n===== BANK MENU =====");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Print Summary");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            choice = scanner.nextInt();

            if (choice == 1) {
                System.out.println("Current balance: " + myAccount.getFormattedBalance());

            } else if (choice == 2) {
                System.out.print("Enter deposit amount: $");
                double amount = scanner.nextDouble();
                myAccount.deposit(amount);

            } else if (choice == 3) {
                System.out.print("Enter withdrawal amount: $");
                double amount = scanner.nextDouble();
                myAccount.withdraw(amount);

            } else if (choice == 4) {
                myAccount.printSummary();

            } else if (choice == 5) {
                System.out.println("Goodbye, " + myAccount.getAccountHolder() + "!");

            } else {
                System.out.println("Invalid option. Please choose 1-5.");
            }
        }

        scanner.close();
    }
}
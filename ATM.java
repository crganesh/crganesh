import java.util.Scanner;

public class ATM {

    private int balance;
    private String userID;
    private String userPin;

    public ATM(int balance, String userID, String userPin) {
        this.balance = balance;
        this.userID = userID;
        this.userPin = userPin;
    }

    public int getBalance() {
        return balance;
    }

    public String getUserID() {
        return userID;
    }

    public String getUserPin() {
        return userPin;
    }

    public void withdraw(int amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawal of $" + amount + " successful.");
        } else {
            System.out.println("Insufficient funds.");
        }
    }

    public void deposit(int amount) {
        balance += amount;
        System.out.println("Deposit of $" + amount + " successful.");
    }

    public void showTransactionHistory() {
        System.out.println("Transaction history:");
        System.out.println("- Withdrawal of $100 on 2023-06-30");
        System.out.println("- Deposit of $500 on 2023-07-01");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your user ID:");
        String userID = scanner.nextLine();

        System.out.println("Enter your user PIN:");
        String userPin = scanner.nextLine();

        ATM atm = new ATM(1000, userID, userPin);

        while (true) {
            System.out.println("What would you like to do?");
            System.out.println("1. Check balance");
            System.out.println("2. Withdraw money");
            System.out.println("3. Deposit money");
            System.out.println("4. Show transaction history");
            System.out.println("5. Quit");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Your balance is $" + atm.getBalance());
                    break;
                case 2:
                    System.out.println("Enter the amount you want to withdraw:");
                    int amount = scanner.nextInt();
                    atm.withdraw(amount);
                    break;
                case 3:
                    System.out.println("Enter the amount you want to deposit:");
                    amount = scanner.nextInt();
                    atm.deposit(amount);
                    break;
                case 4:
                    atm.showTransactionHistory();
                    break;
                case 5:
                    System.out.println("Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
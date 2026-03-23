package Workshop;

public class BankAcc10 {
    private double balance;

    // Constructor
    public BankAcc10(double initialBalance) {
        balance = initialBalance;
    }

    // getter method
    public double getBalance() {
        return balance;
    }

    // method to deposit money
    public void deposit(double amount) {
        balance += amount;
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient amount");
        }
    }

    public static void main(String[] args) {
        BankAcc10 account = new BankAcc10(1000);

        account.deposit(500);
        account.withdraw(200);

        System.out.println("Current Balance: " + account.getBalance());
    }
}
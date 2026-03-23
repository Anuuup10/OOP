package Workshop;

public class BankAccount13 {
	private double balance;
	private String accountHolder;
	
	 // No-argument constructor
	public BankAccount13() {
		balance = 0.0;
		accountHolder = "IronMan";
	}
	
	// Constructor with one parameter (balance only)
    public BankAccount13(double balance) {
        this.balance = balance;
        this.accountHolder = "Thor";
    }

    // Constructor with two parameters (balance and account holder name)
    public BankAccount13(double balance, String accountHolder) {
        this.balance = balance;
        this.accountHolder = accountHolder;
    }
    
 // Getter methods
    public double getBalance() {
        return balance;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    // Deposit method
    public void deposit(double amount) {
        balance += amount;
    }

    // Withdraw method
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance");
        }
    }
    
 // Main method
    public static void main(String[] args) {
        // Different initialization scenarios
        BankAccount13 acc1 = new BankAccount13();
        BankAccount13 acc2 = new BankAccount13(1000);
        BankAccount13 acc3 = new BankAccount13(2000, "SpiderMan");

        System.out.println("Account 1: " + acc1.getAccountHolder() + ", Balance: " + acc1.getBalance());
        System.out.println("Account 2: " + acc2.getAccountHolder() + ", Balance: " + acc2.getBalance());
        System.out.println("Account 3: " + acc3.getAccountHolder() + ", Balance: " + acc3.getBalance());
    }

}

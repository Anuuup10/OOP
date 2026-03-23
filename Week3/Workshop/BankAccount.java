package Workshop;

public class BankAccount {
	String accountNumber;
	double balance;
	String accountHolderName;
	String accountHolderAddress;
	
	// Task 5
	
	// Method to deposit money
	public void depositMoney(double amount) {
		balance = balance + amount;
		System.out.println("Deposited: " + amount);
		System.out.println("Current Balance: " + balance);
	}
	
	 // Method to withdraw money
	public void withdrawMoney(double amount) {
		if(amount <= balance) {
			balance = balance - amount;
			System.out.println("Withdrawn: " + amount);
		}
		else {
			System.out.println("Insufficient Balance");
		}
		System.out.println("Current Balance: " + balance);
	}
	
}

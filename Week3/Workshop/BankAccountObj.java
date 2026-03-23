package Workshop;

public class BankAccountObj {
	public static void main(String[] args) {
		BankAccount acc = new BankAccount();
		
		acc.accountNumber = "A5973B";
		acc.balance = 15000.0;
		acc.accountHolderName = "Anup";
		acc.accountHolderAddress = "Brt";
		
		System.out.println("Account Number: " + acc.accountNumber);
        System.out.println("Balance: " + acc.balance);
        System.out.println("Name: " + acc.accountHolderName);
        System.out.println("Address: " + acc.accountHolderAddress);
        
        // Task 5
        acc.depositMoney(500);
        acc.withdrawMoney(300);
	}

}

package Workshop;

public class BankAcc {
	int accountNumber;
    String accountHolder;
    double balance;
    
    BankAcc(int accNum, String holder, double bal) {
        accountNumber = accNum;
        accountHolder = holder;
        balance = bal;
    }
    
    void display() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: $" + balance);
    }

    public static void main(String[] args) {
        BankAcc myAccount = new BankAcc(123456, "Anup", 1000.50);
        myAccount.display();
    }

}

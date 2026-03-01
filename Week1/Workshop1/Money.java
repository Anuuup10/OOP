package Workshop1;

import java.util.Scanner;

public class Money {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Amount: ");
		double amount = sc.nextDouble();
		System.out.print("Enter Exchange Rate: ");
		double rate = sc.nextDouble();
		double total = amount * rate;
		System.out.println("Converted Amount: " + total);
		sc.close();
		
	}

}

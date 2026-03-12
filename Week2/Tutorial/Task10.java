package Tutorial;

import java.util.Scanner;

public class Task10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number: ");
		int num = sc.nextInt();
		int fact = 1;
		for(int i = 1; i <= num; i++) {
			fact = fact * i;
		}
		System.out.print("Factorial of " + num + " is " + fact);
	}

}

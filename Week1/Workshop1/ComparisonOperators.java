package Workshop1;

import java.util.Scanner;

public class ComparisonOperators {
	
	public static void main(String[] args) {
		Scanner sc = new  Scanner(System.in);
		System.out.print("Enter first num: ");
		int a = sc.nextInt();
		System.out.print("Enter second num: ");
		int b = sc.nextInt();
		System.out.print("Enter third num: ");
		int c = sc.nextInt();
		System.out.print("Enter fourth num: ");
		int d = sc.nextInt();
		if (a > b && c > d) {
			System.out.print("You have used AND operator");
		}else if (a > b || c > d) {
			System.out.print("You have used OR operator");
		}else if(a != b) {
			System.out.print("You have used NOT EQUAL TO operator");
		}

	}
	
	

}

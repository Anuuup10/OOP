package tutorial;

import java.util.Scanner;

public class Logical {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter first number: ");
		int exp1 = in.nextInt();
		System.out.println("Enter second number: ");
		int exp2 = in.nextInt();
		System.out.println("Enter third number: ");
		int exp3 = in.nextInt();
		System.out.println("Enter fourth number: ");
		int exp4 = in.nextInt();
		if (exp1 > exp2 && exp3 > exp4) {
			System.out.println("You have used AND Logic");
		}else if (exp1 > exp2 || exp3 > exp4) {
			System.out.println("You have used OR Logic");
		}
		in.close();
		
	}

}

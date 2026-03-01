package tutorial;

import java.util.Scanner;

public class Interest {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Principle: ");
		double p = in.nextDouble();
		System.out.println("Enter Time: ");
		double t = in.nextDouble();
		System.out.println("Enter Rate: ");
		double r = in.nextDouble();
		double SI = (p * t * r) / 100;
		System.out.println("Simple Interest is " + SI);
		in.close();
	}

}

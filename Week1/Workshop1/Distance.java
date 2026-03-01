package Workshop1;

import java.util.Scanner;

public class Distance {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter distance in miles: ");
		double miles = sc.nextDouble();
		double km = miles * 1.6;
		System.out.println("Miles to KM: " + km + " KM");
		sc.close();
		
	}
}

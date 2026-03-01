package Workshop1;

import java.util.Scanner;

public class SquareArea {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter length: ");
		double length = sc.nextDouble();
		double area = length  * length;
		System.out.println("Area: " + area);
		sc.close();
	}
}

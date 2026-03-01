package Workshop1;

import java.util.Scanner;

public class TriangleArea {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Side a: ");
		double a = sc.nextDouble();
		System.out.print("Enter Side b: ");
		double b = sc.nextDouble();
		System.out.print("Enter Side c: ");
		double c = sc.nextDouble();
		double s = (a + b + c) / 3;
		double A = Math.sqrt(s*(s-a)*(s-b)*(s-c));
		System.out.println("Area of triangle: " + A);
		sc.close();
	}

}

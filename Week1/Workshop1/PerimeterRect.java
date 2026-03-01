package Workshop1;

import java.util.Scanner;

public class PerimeterRect {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a length: ");
		double length = sc.nextDouble();
		System.out.print("Enter a width: ");
		double width = sc.nextDouble();
		double perimeter = 2 * (length + width);
		System.out.println("Peimeter: " + perimeter);
		sc.close();
	}

}

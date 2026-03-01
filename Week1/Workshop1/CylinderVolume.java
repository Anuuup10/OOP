package Workshop1;

import java.util.Scanner;

public class CylinderVolume {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Radius: ");
		double r = sc.nextDouble();
		System.out.print("Enter Height: ");
		double h = sc.nextDouble();
		double volume = 3.14 * r * r * h;
		System.out.println("Volume: " + volume);
		sc.close();
	}

}

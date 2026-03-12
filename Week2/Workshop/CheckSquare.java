package Workshop;

import java.util.Scanner;

public class CheckSquare {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Length: ");
		int l = sc.nextInt();
		System.out.print("Enter Breadth: ");
		int b = sc.nextInt();
		if(l == b) {
			System.out.println("It is a Square");
		}else {
			System.out.println("It is not a Square");
		}
		sc.close();
	}

}

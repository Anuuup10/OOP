package Tutorial;

import java.util.Scanner;

public class Task2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = sc.nextInt();
		if(num % 2 == 0) {
			System.out.println(num + " is an Even");
		}else {
			System.out.println(num + " is an Odd");
		}
		sc.close();
	}

}

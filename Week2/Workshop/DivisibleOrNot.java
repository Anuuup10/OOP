package Workshop;

import java.util.Scanner;

public class DivisibleOrNot {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = sc.nextInt();
		if(num % 2 == 0) {
			if(num % 4 == 0) {
				System.out.println(num + " is even and divisible by 4.");
			}else {
				System.out.println(num + " is even but not divisible by 4.");
			}
		}else {
			if(num % 7 == 0) {
				System.out.println(num + " is odd and divisible by 7.");
			}else {
				System.out.println(num + " is odd but not divisible by 7.");
			}
		}
		sc.close();
	}

}

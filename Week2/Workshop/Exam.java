package Workshop;

import java.util.Scanner;

public class Exam {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Do you have a medical cause? (y/n)");
		char ans = sc.next().charAt(0);
		if(ans == 'y' || ans == 'Y') {
			System.out.println("You are not allowed to sit int the exam.");
		}else if(ans == 'n' || ans == 'N') {
			System.out.println("You are allowed to sit in the exam.");
		}else {
			System.out.println("Invalid Input.");
		}
		sc.close();
	}

}

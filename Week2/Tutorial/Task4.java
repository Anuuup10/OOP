package Tutorial;

import java.util.Scanner;

public class Task4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your Gender: ");
		String gender = sc.nextLine();
		switch(gender){
		case "male":
			System.out.println("Your gender is Male");
			break;
		case "female":
			System.out.println("Your Gender is Female");
			break;
		default:
			System.out.println("Please Enter Gender");
		}
		sc.close();
	}

}

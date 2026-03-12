package Workshop;

import java.util.Scanner;

public class GradingSystem {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter marks: ");
		int marks = sc.nextInt();
		if (marks > 90) {
            System.out.println("You got A+");
        } 
        else if (marks > 80 && marks <= 90) {
            System.out.println("You got A");
        } 
        else if (marks > 70 && marks <= 80) {
            System.out.println("You got B+");
        } 
        else if (marks > 60 && marks <= 70) {
            System.out.println("You got B");
        } 
        else if (marks > 50 && marks <= 60) {
            System.out.println("You got C+");
        } 
        else if (marks > 40 && marks <= 50) {
            System.out.println("You got C");
        } 
        else {
            System.out.println("You got Failed");
        }
		sc.close();
	}

}

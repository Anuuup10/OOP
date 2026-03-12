package Workshop;

import java.util.Scanner;

public class SumOfEvenNum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of terms: ");
		int num = sc.nextInt();
		int sum = 0;
		int i = 1;
		while(i <= num) {
			if(i % 2 == 0) {
				sum = sum + i;
			} i++;
		}
		System.out.println("Sum of first " + num + " even number is " + sum);
		sc.close();
	}   

}

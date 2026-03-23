package Workshop;

public class Task2 {
	public static void main(String[] args) {
		double []numbers = {10.2, 5.5, 2.1, 3.3, 6.8};
		
		// For Sum
		double sum = 0;
		for(int i = 0; i < numbers.length; i++) {
			sum = sum + numbers[i];
		}
		System.out.println("Sum : " + sum);
		
		// For Average
		double average = sum / numbers.length;
		System.out.println("Average : " + average);
	}

}

package Tutorial;

public class Multiplication {
	public int multi(int a, int b) {
		return a * b;
	}
	
	public static void factorial(int a) {
		int fact = 1;
		for(int i = 1; i <= a; i++) {
			fact = fact * i;
		}
		System.out.println(fact);
	}

}

package tutorial;
import java.util.Scanner;

public class Temp {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Celcius: ");
		double celcius = in.nextDouble();
		double fahrenheit = (9/5) * celcius + 32;
		System.out.println("The fahrenheit is " + fahrenheit);
		in.close();
	}

}

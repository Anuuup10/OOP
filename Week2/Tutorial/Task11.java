package Tutorial;

public class Task11 {
	public static void main(String[] args) {
		// For Loop
		for(int i = 1; i <= 10; i++) {
			if(i == 5) {
				continue;
			}
			System.out.println(i);
		}
		
		// While Loop
		int i = 1;
		while(i <= 10) {
			if(i == 5) {
				i++;
				continue;
			}
			System.out.println(i);
			i++;
		}
	}

}

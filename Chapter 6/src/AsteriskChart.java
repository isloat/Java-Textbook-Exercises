import java.util.*;

public class AsteriskChart {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<Integer> values = new ArrayList<Integer>();
		
		boolean loop = true;
		int inputValue = 0;
		int maximum = 0;
		
		while (loop) {
			System.out.print("Enter a positive integer. -1 to finish: ");
			inputValue = input.nextInt();
			if (inputValue == -1) {
				loop = false;
			} else if (inputValue < 0) {
				
			} else {
				if (inputValue > maximum) maximum = inputValue;
				values.add(inputValue);
			}
		}
		
		drawAsterisk(values, maximum);
	}
	
	public static void drawAsterisk(ArrayList<Integer> values, int maximum) {
		final int MAX_LENGTH = 40;
		double asterisks = 0;
		
		for (int i = 0; i < values.size(); i++) {
			asterisks = (double) values.get(i) / maximum * MAX_LENGTH; // translate to proportion of max length
			
			for (int j = 0; j < asterisks; j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
}

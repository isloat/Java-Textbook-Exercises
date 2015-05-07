import java.util.*;

public class AsteriskChart {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<Integer> values = new ArrayList<Integer>();
		
		int numberBars = 0;
		
		System.out.print("How many numbers will you want to convert to bar graph? ");
		numberBars = input.nextInt();
		
		int inputValue = 0;
		int maximum = 0;
		int minimum = 0;
		
		for (int i = 0; i < numberBars; i++) {
			System.out.print("Enter a number: ");
			inputValue = input.nextInt();
			
			if (inputValue > maximum) maximum = inputValue;
			if (inputValue < minimum) minimum = inputValue;
			values.add(inputValue);
		}
		
		System.out.println();
		drawAsterisk(values, maximum, minimum);
	}
	
	public static void drawAsterisk(ArrayList<Integer> values, int maximum, int minimum) {
		final int MAX_LENGTH = 20;
		double asterisks = 0;
		int total = 0;
		double negativeLengthMax = 0;
		double shrinkValue = 0;
		double spacesToDraw = 0;
		
		if (minimum < 0) {
			// Calculate absolute length.
			total = (minimum * -1) + maximum;
			// Calculate proportion of absolute length to maximum length.
			shrinkValue = (double) total / MAX_LENGTH;
			 // Set max negative asterisks.
			negativeLengthMax = Math.floor((double) (minimum * -1) / shrinkValue);
		} else {
			 // Set the proportion of absolute length to max length.
			shrinkValue = (double) maximum / MAX_LENGTH;
		}
		
		for (int i = 0; i < values.size(); i++) {
			if (values.get(i) > 0) { 
				asterisks = Math.floor(values.get(i) / shrinkValue);
				spacesToDraw = negativeLengthMax;
				
				// Print spaces until zero point reached.
				for (int j = 0; j < spacesToDraw; j++) { 
					System.out.print(" ");
				}
				
				// Print asterisks until proportional bar is created.
				for (int j = 0; j < asterisks; j++) {
					System.out.print("*");
				}
				
				System.out.println();
			} else if (values.get(i) < 0) {
				asterisks = Math.floor((values.get(i) * -1) / shrinkValue);
				/*  This is the reverse of the behavior in above if-clause. We want to
				 *  space out the difference between the negative max and the current
				 *  negative bar.
				 */
				spacesToDraw = negativeLengthMax - asterisks;
						
				for (int j = 0; j < spacesToDraw; j++) {
					System.out.print(" ");
				}
				
				for (int j = 0; j < asterisks; j++) {
					System.out.print("*");
				}
				
				System.out.println();
			} else System.out.println();
		}
	}
}

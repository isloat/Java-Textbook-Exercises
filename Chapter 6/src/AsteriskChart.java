import java.util.*;

public class AsteriskChart {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<Integer> values = new ArrayList<Integer>();
		
		int numberBars = 0;
		
		int inputValue = 0;
		int maximum = 0;
		int minimum = 0;
		
		System.out.print("How many numbers will you want to convert to bar graph? ");
		numberBars = input.nextInt();
		
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
		double spaceToCenter = 0;
		
		if (minimum < 0) {
			total = (minimum * -1) + maximum; // find out the absolute length
			shrinkValue = (double) total / MAX_LENGTH; // find out proportion of absolute length to maximum length
			negativeLengthMax = Math.floor((double) (minimum * -1) / shrinkValue); // max negative asterisks
		} else {
			shrinkValue = (double) maximum / MAX_LENGTH; // proportion of absolute length to max length
			negativeLengthMax = 0; // not used here
			spaceToCenter = 0; // not used here
		}
		
		for (int i = 0; i < values.size(); i++) { // cycle through entire arraylist
			if (values.get(i) > 0) { // if value is positive
				asterisks = Math.floor(values.get(i) / shrinkValue); // adjust value
				
				for (int j = 0; j < negativeLengthMax; j++) { // print spaces until zero point reached
					System.out.print(" ");
				}
				
				for (int j = 0; j < asterisks; j++) { // print asterisks until proportional bar is created
					System.out.print("*");
				}
				
				System.out.println();
			} else if (values.get(i) < 0) { // if value is negative
				asterisks = Math.floor((values.get(i) * -1) / shrinkValue); // adjust the value
				spaceToCenter = negativeLengthMax - asterisks; // space down from maximum negative length to where negative-bar starts 
						
				for (int j = 0; j < spaceToCenter; j++) { // print spaces until start drawing bar
					System.out.print(" ");
				}
				
				for (int j = 0; j < asterisks; j++) { // print asterisks to zero point
					System.out.print("*");
				}
				
				System.out.println();
			} else System.out.println(); // zero point = no bar drawn (TODO: fix?)
		}
	}
}

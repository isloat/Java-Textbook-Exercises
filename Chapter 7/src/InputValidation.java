import java.util.*;

/* Ask the user to input a set of floats.
 * When the user enters a non-number, give them a second chance to enter a value.
 * After two "misses", cease reading input.
 * Add all correctly specified values and print the sum.
 * 
 * Use exception handling.
 */
public class InputValidation {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int chances = 0;
		double sum = 0;
		int count = 0;
		
		System.out.print("Enter a set of floating point values: ");
		
		while (chances < 2) {
			try {
				sum += input.nextDouble();
				count++;
			} catch (InputMismatchException e) {
				String badInput = input.next();
				chances++;
			}
		}
		input.close();
		
		double average = sum / count;
		
		System.out.println("The average of this set is: " + average + ".");
	}
}

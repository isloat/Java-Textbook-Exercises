import java.util.Scanner;

public class FloatRead {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a floating point number. Enter -1 to finish: ");
		float max = 0;
		float min = 0;
		float average = 0;
		float total = 0;
		float amount = 0;
		float range = 0;
		boolean firstRun = true;
		
		float fpt = input.nextFloat();
		
		while (fpt != -1) {
			if (fpt  > max) {
				max = fpt;
			}
				
			if (fpt < min || firstRun) {
				min = fpt;
			}
			
			amount++;
			total += fpt;
			average = total / amount;
			
			range = max - min;
			
			System.out.println("The largest float is " + max + ".");
			System.out.println("The smallest float is " + min + ".");
			System.out.println("The average number is " + average + ".");
			System.out.println("The range is " + range + ".");
			
			System.out.print("\n\nEnter another floating point number. Enter -1 to finish: ");
			firstRun = false;
			fpt = input.nextFloat();
		}
	}
}

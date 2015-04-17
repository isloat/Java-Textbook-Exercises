import java.util.Scanner;

public class IntegerLoop {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a sequence of integers. Enter -1 to finish: ");
		int integer = 0;
		int max = 0;
		int min = 0;
		boolean firstRun = true;
		int even = 0;
		int odd = 0;
		int total = 0;
		int duplicateMemory = 0;
		int previousInt = 0;
		String duplicate = "";
		String cumulative = "";
		
		while (integer != -1) {
			integer = input.nextInt();
			
			if (integer != -1) {
				if (integer > max) {
					max = integer;
				}
				
				if (integer < min || firstRun) {
					min = integer;
				}
				
				if (integer % 2 == 0 && integer != 0) {
					even++;
				} else if (integer != 0) {
					odd++;
				}
				
				total += integer;
				cumulative = cumulative + total + " ";
				
				if (integer == previousInt && duplicateMemory == 0) {
					duplicate = duplicate + integer + " ";
					duplicateMemory = 1;
				} else if (integer == previousInt && duplicateMemory == 1) {
					// do nothing
				} else {
					duplicateMemory = 0;
				}
				
				previousInt = integer;
				firstRun = false;
			}
		}
		
		System.out.println("The largest integer is " + max + ".");
		System.out.println("The smallest integer is " + min + ".");
		System.out.println("There were " + even + " even integers and " + odd + " odd integers.");
		System.out.println("Cumulative totals: " + cumulative);
		System.out.println("Adjacent duplicates: " + duplicate);
	}
}

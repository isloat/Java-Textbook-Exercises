import java.util.Scanner;

public class IntegerDigits {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter an integer: ");
		int integer = input.nextInt();
		
		if (integer < 0) {
			integer = integer * -1;
		}
		
		//As per exercise, assume all numbers are less than 10 billion.
		//The exercise intends for me to do it via, like, 11 separate if clauses
		//easier to just do it with a while loop and integer division
		
		int integerTrack = integer;
		int integerCount = 0;
		
		while (integer != 0) {
			integer = integer / 10;
			integerCount++;
		}
		
		System.out.println("Your integer " + integerTrack + " has " + integerCount + " digits.");
	}
}

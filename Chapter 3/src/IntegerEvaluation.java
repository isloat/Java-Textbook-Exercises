import java.util.Scanner;

public class IntegerEvaluation {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter an integer: ");
		int integer = input.nextInt();
		
		if (integer > 0) {
			System.out.println("Your integer " + integer + " is positive.");
		} else if (integer == 0) {
			System.out.println("Your integer " + integer + " is zero.");
		} else {
			System.out.println("Your integer " + integer + " is negative.");
		}
	}
}

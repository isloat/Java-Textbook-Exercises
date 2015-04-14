import java.util.Scanner;

public class StrictNumberSequence {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		double number1 = input.nextDouble();
		System.out.print("Enter a second number: ");
		double number2 = input.nextDouble();
		System.out.print("Enter the last number: ");
		double number3 = input.nextDouble();
		System.out.print("Should the sequence be STRICT or LENIENT?: ");
		String strict = input.next();
		System.out.println(strict);
	
		if (strict.equals("STRICT") || strict.equals("Strict") || strict.equals("strict")) {
			if (number3 > number2 && number2 > number1) {
				System.out.println("Your numbers are in increasing order!");
			} else if (number1 > number2 && number2 > number3) {
				System.out.println("Your numbers are in decreasing order!");
			} else {
				System.out.println("Your numbers are not in any particular order.");
			}
		} else if (strict.equals("LENIENT") || strict.equals("Lenient") || strict.equals("lenient")) {
			if (number1 == number2 && number2 == number3) {
				System.out.println("Your numbers are in both increasing and decreasing order.");
			} else if (number3 >= number2 && number2 >= number1) {
				System.out.println("Your numbers are in increasing order!");
			} else if (number1 >= number2 && number2 >= number3) {
				System.out.println("Your numbers are in decreasing order!");
			} else {
				System.out.println("Your numbers are not in any particular order.");
			}
		} else { System.out.println("error"); }
	}
}

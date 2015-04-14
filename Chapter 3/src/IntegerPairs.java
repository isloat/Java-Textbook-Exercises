import java.util.Scanner;

public class IntegerPairs {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		double number1 = input.nextDouble();
		System.out.print("Enter a second number: ");
		double number2 = input.nextDouble();
		System.out.print("Enter the third number: ");
		double number3 = input.nextDouble();
		System.out.print("Enter the last number: ");
		double number4 = input.nextDouble();
		
		int pairs = 0;
		
		// See if there are two separate pairs in those four numbers.
		if (number1 == number2) {
			pairs++;
			if (number3 == number4) {
				pairs++;
			}
		} else if (number1 == number3) {
			pairs++;
			if (number2 == number4) {
				pairs++;
			}
		} else if (number1 == number4) {
			pairs++;
			if (number2 == number3) {
				pairs++;
			}
		}
		
		if (pairs == 2) {
			System.out.println("Your numbers form two pairs.");
		} else {
			System.out.println("Your numbers do not form two pairs.");
		}
	}
}

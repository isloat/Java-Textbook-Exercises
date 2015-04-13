import java.util.Scanner;

public class InputComparison {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the first integer to be compared: ");
		int integerOne = input.nextInt();
		System.out.print("Now, enter the second integer: ");
		int integerTwo = input.nextInt();
		
		int integerSum = integerOne + integerTwo;
		int integerDifference = integerOne - integerTwo;
		int integerProduct = integerOne * integerTwo;
		double integerAverage = (integerOne + integerTwo) / 2;
		int integerDistance = Math.abs(integerOne - integerTwo);
		int integerMaximum = Math.max(integerOne, integerTwo);
		int integerMinimum = Math.min(integerOne, integerTwo);
		
		System.out.println("\nYour two numbers are " + integerOne + " and " + integerTwo + ".");
	}
}

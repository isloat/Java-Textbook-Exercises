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
		System.out.printf("\nSum:        %9d", integerSum);
		System.out.printf("\nDifference: %9d", integerDifference);
		System.out.printf("\nProduct:    %9d", integerProduct);
		System.out.printf("\nAverage:    %12.2f", integerAverage);
		System.out.printf("\nDistance:   %9d", integerDistance);
		System.out.printf("\nMaximum:    %9d", integerMaximum);
		System.out.printf("\nMinimum:    %9d", integerMinimum);
	}
}

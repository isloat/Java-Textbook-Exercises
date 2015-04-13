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
		System.out.println("The sum of those numbers is " + integerSum + ".");
		System.out.println("The difference of those numbers is " + integerDifference + ".");
		System.out.println("The product of those numbers is " + integerProduct + ".");
		System.out.println("The average of those numbers is " + integerAverage + ".");
		System.out.println("The distance between those numbers is " + integerDistance + ".");
		System.out.println("The larger number is " + integerMaximum + ".");
		System.out.println("The smaller number is " + integerMinimum + ".");
	}
}

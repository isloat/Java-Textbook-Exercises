import java.util.Scanner;

public class ThreeWiseNumbers {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		double number1 = input.nextDouble();
		System.out.print("Enter a second number: ");
		double number2 = input.nextDouble();
		System.out.print("Enter the last number: ");
		double number3 = input.nextDouble();
	
		if (number1 == number2 && number2 == number3) {
			System.out.println("All three numbers are the same!");
		} else if (number1 != number2 && number2 != number3 && number1 != number3) {
			System.out.println("None of the three numbers are the same!");
		} else {
			System.out.println("Your numbers are neither all the same nor all different.");
		}
	}
}

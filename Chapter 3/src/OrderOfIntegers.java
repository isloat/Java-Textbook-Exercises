import java.util.Scanner;

public class OrderOfIntegers {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		double number1 = input.nextDouble();
		System.out.print("Enter a second number: ");
		double number2 = input.nextDouble();
		System.out.print("Enter the last number: ");
		double number3 = input.nextDouble();

		if (number1 >= number2 && number2 >= number3) {
			System.out.println("Your numbers are in order.");
		} else if (number1 <= number2 && number2 <= number3) {
			System.out.println("Your numbers are in order.");
		} else {
			System.out.println("Your numbers are not in order.");
		}
	}
}

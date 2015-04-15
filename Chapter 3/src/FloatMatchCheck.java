import java.util.Scanner;

public class FloatMatchCheck {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter two numbers: ");
		double number1 = input.nextDouble();
		double number2 = input.nextDouble();
		
		number1 = number1 * 100;
		number2 = number2 * 100;
		int number3 = (int) number1;
		int number4 = (int) number2;
		
		if (number3 == number4) {
			System.out.println("They are the same up to two decimal places.");
		} else {
			System.out.println("They are different.");
		}
	}
}

import java.util.Scanner;

public class LargestFPN {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter three numbers: ");
		double number1 = input.nextDouble();
		double number2 = input.nextDouble();
		double number3 = input.nextDouble();
		
		if (number3 >= number2) {
			number2 = number3;
		}
		
		if (number2 >= number1) {
			number1 = number2;
		}
		
		System.out.println("The largest number is " + number1);
		
	}
}

import java.util.Scanner;

public class InputPowers {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double numberSquare;
		double numberCube;
		double numberFourth;
		
		System.out.print("Enter the number to be powered up: ");
		int inputNumber = input.nextInt();
		numberSquare = inputNumber * inputNumber;
		numberCube = inputNumber * inputNumber * inputNumber;
		numberFourth = Math.pow(inputNumber, 4);
		System.out.println("The square of " + inputNumber + " is " + numberSquare + ".");
		System.out.println("The cube of " + inputNumber + " is " + numberCube + ".");
		System.out.println("The fourth power of " + inputNumber + " is " + numberFourth + ".");
	}
}

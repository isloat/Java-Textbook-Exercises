import java.util.Scanner;

public class FloatingPointEvaluation {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a floating point number: ");
		double fpn = input.nextDouble();
		
		if (fpn > 0) {
			System.out.println("Your floating point number " + fpn + " is positive.");
		} else if (fpn == 0) {
			System.out.println("Your floating point number " + fpn + " is zero.");
		} else {
			System.out.println("Your floating point number " + fpn + " is negative.");
		}
		
		if (Math.abs(fpn) > 1000000) {
			System.out.println("This number is also a large number.");
		} else if (Math.abs(fpn) < 1 && Math.abs(fpn) > 0) {
			System.out.println("This number is also a small number.");
		}
	}
}

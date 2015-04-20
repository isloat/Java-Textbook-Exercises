import java.util.Scanner;

public class FibonacciFinder {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the nth digit of the Fibonacci number: ");
		int digit = input.nextInt();
		
		int fold1 = 1;
		int fold2 = 1;
		int fnew = 0;
		String sequence = fold1 + " " + fold2;
		
		// generate the F-number
		for (int i = 0; i < digit; i++) {
			fnew = fold1 + fold2;
			
			fold2 = fold1;
			fold1 = fnew;
			sequence = sequence + " " + fnew;
		}
		
		// System.out.println(sequence);
		int foundDigit = (int) (fnew / Math.pow(10, digit)) % 10;
		
		System.out.println("The " + digit + "th digit of the Fibonacci sequence is " + fnew + ".");
	}
}

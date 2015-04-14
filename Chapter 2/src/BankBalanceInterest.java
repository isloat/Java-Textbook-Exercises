import java.util.Scanner;

public class BankBalanceInterest {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the initial balance of your bank account: ");
		double initialBalance = input.nextDouble();
		System.out.print("Enter the annual interest rate (in percent) for your account: ");
		double interestRate = input.nextDouble();
		
		interestRate = interestRate / 100;
		// A = P ( 1 + r / n) ^ nt
		double firstBalance = initialBalance * Math.pow((1 + (interestRate / 12)), (12 * 1 / 12));
		double secondBalance = firstBalance * Math.pow((1 + (interestRate / 12)), (12 * 1 / 12));
		double thirdBalance = secondBalance * Math.pow((1 + (interestRate / 12)), (12 * 1 / 12));
		
		System.out.println("\nInitial balance: " + initialBalance);
		System.out.printf("Annual interest rate: %.1f", interestRate * 100);
		System.out.printf("\nAfter first month: %5.2f", firstBalance);
		System.out.printf("\nAfter second month: %5.2f", secondBalance);
		System.out.printf("\nAfter third month: %5.2f", thirdBalance);
	}
}

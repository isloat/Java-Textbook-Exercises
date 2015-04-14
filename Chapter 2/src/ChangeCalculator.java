import java.util.Scanner;

public class ChangeCalculator {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Input the amount due: ");
		double amountDue = input.nextDouble();
		System.out.print("Input the amount received: ");
		double amountReceived = input.nextDouble();
		
		int dollarsDue = (int) (amountDue / 1);
		int centsDue = (int) ((amountDue % 1) * 100);
		centsDue = dollarsDue * 100 + centsDue; // Convert all to cents for easier calculation
		
		int dollarsReceived = (int) (amountReceived / 1);
		int centsReceived = (int) ((amountReceived % 1) * 100);
		centsReceived = dollarsReceived * 100 + centsReceived; // Convert all to cents for easier calculation
		
		int change = centsReceived - centsDue;
		int dollarChange = change / 100;
		change = change % 100;
		int quarterChange = change / 25;
		change = change % 25;
		int dimeChange = change / 10;
		change = change % 10;
		int nickelChange = change / 5;
		change = change % 5;
		int pennyChange = change;
		
		System.out.println("Give the customer " + dollarChange + " dollars, " + quarterChange + " quarters, " + dimeChange + " dimes, " + nickelChange + " nickels, " + pennyChange + " pennies in change.");
	}
}

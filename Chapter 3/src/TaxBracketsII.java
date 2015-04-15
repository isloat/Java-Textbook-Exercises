import java.util.Scanner;

public class TaxBracketsII {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter your income: $");
		double income = input.nextDouble();
		System.out.print("Are you 'M'arried or 'S'ingle?: ");
		String status = input.next();
		
		double tax = 0;
		
		if (status.equals("S")) {
			if (income <= 8000) {
				tax = 0.1 * income;
			} else if (income <= 32000) {
				tax = 0.15 * (income - 8000) + 800;
			} else {
				tax = 0.25 * (income - 32000) + 4400;
			}
		} else if (status.equals("M")) {
			if (income <= 16000) {
				tax = 0.1 * income;
			} else if (income <= 64000) {
				tax = 0.15 * (income - 16000) + 1600;
			} else {
				tax = 0.25 * (income - 64000) + 8800;
			}
		} else {
			System.out.println("There was an error with your martial status. Try again.");
		}
		
		System.out.println("The amount owed is $" + tax);
	}
}

import java.util.Scanner;

public class TaxBrackets {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter your income: $");
		double income = input.nextDouble();
		
		double tax = 0;
		
		// 1% on first 50k
		// 2% on next 25k = 50001-75k
		// 3% on next 25k = 75001-100k
		// 4% on next 150k = 100001-250k
		// 5% on next 250k = 250001-500k
		// 6% on any remaining = 500001 and above
		
		if (income <= 50000) {
			tax += income * 0.01;
		} else {
			tax += 50000 * 0.01;
			income = income - 50000;
			
			if (income <= 25000) {
				tax += income * 0.02;
			} else {
				tax += 25000 * 0.02;
				income = income - 25000;			
				
				if (income <= 25000) {
					tax += income * 0.03;
				} else {
					tax += 25000 * 0.03;
					income = income - 25000;
					
					if (income <= 150000) {
						tax += income * 0.04;
					} else {
						tax += 150000 * 0.04;
						income = income - 150000;
						
						if (income <= 250000) {
							tax += income * 0.05;
						} else {
							tax += 250000 * 0.05;
							income = income - 250000;
							tax += income * 0.06;
						}
					}
				}
			}
		}
		
		System.out.println("You owe $" + tax);
	}
}

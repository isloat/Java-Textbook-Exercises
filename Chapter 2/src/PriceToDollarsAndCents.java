import java.util.Scanner;

public class PriceToDollarsAndCents {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a price: ");
		double price = input.nextDouble();
		
		int dollars = (int) price;
		int cents = (int) ((price - dollars) * 100 + 0.5);
		
		System.out.println(dollars + " dollars and " + cents + " cents.");
	}
}

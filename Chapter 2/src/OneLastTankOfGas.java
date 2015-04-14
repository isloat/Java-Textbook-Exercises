import java.util.Scanner;

public class OneLastTankOfGas {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("How many gallons of gas are in the tank?: ");
		int tankGallons = input.nextInt();
		System.out.print("What is your car's fuel efficiency in miles per gallon?: ");
		double fuelEfficiency = input.nextDouble();
		System.out.print("What is the price of gas?: ");
		double gasPrice = input.nextDouble();
		
		double costPer100 = 100 / fuelEfficiency * gasPrice;
		double distanceToGo = tankGallons * fuelEfficiency;
		System.out.printf("\nIt costs $%.2f", costPer100);
		System.out.printf(" to go 100 miles with your car. You can drive for another %.0f", distanceToGo);
		System.out.print(" miles.");
	}
}

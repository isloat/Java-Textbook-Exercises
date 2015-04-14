import java.util.Scanner;

public class HybridComparison {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("This program will calculate the total cost of a new car over five years.");
		System.out.print("Enter the cost of the new car in dollars: ");
		int carCost = input.nextInt();
		System.out.print("Estimate how many miles you drive per year: ");
		int milesPerYear = input.nextInt();
		System.out.print("What is the price of gas?: ");
		double gasPrice = input.nextDouble();
		System.out.print("What is the fuel efficiency of this car?: ");
		double fuelEfficiency = input.nextDouble();
		System.out.print("What is the estimated resale value, in dollars, of this car after 5 years?: ");
		int resaleValue = input.nextInt();
		
		double totalCost = carCost + ((milesPerYear * gasPrice) / fuelEfficiency) - resaleValue;
		System.out.printf("\n\nThe total cost of owning this car is: $%.2f", totalCost);
		
	}
}

import java.util.Scanner;

public class DiscountCalculator {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	
		System.out.print("Enter the number of movie rentals: ");
		int movieRentals = input.nextInt();
		System.out.print("Enter the number of members referred to the video club: ");
		int membersReferred = input.nextInt();
		
		double discount = Math.min(movieRentals + membersReferred, 75);
		
		System.out.printf("The discount is equal to: %.2f", discount);
		System.out.print(" percent.");
	}
}

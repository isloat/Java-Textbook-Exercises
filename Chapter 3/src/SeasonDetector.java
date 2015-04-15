import java.util.Scanner;

public class SeasonDetector {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the number of the current month: ");
		int month = input.nextInt();
		System.out.print("Enter the current date as a number: ");
		int day = input.nextInt();
		
		String season = null;
		
		if (month == 1 || month == 2 || month == 3) {
			season = "Winter";
		} else if (month == 4 || month == 5 || month == 6) {
			season = "Spring";
		} else if (month == 7 || month == 8 || month == 9) {
			season = "Summer";
		} else if (month == 10 || month == 11 || month == 12) {
			season = "Autumn";
		} else {
			season = "Error";
		}
		
		if (((month % 3) == 0) && (day >= 21)) {
			if (season.equals("Winter")) {
				season = "Spring";
			} else if (season.equals("Spring")) {
				season = "Summer";
			} else if (season.equals("Summer")) {
				season = "Autumn";
			} else if (season.equals("Autumn")) {
				season = "Winter";
			} else {
				season = "Error";
			}
		}
		
		System.out.println("It is " + season + " at the moment.");
	}
}

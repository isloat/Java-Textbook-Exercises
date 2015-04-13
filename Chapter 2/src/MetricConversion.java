import java.util.Scanner;

public class MetricConversion {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		final double METERS_TO_INCHES = 39.3701;
		final int INCHES_TO_FEET = 12;
		final int FEET_TO_MILES = 5280;
		
		System.out.print("Enter your measurement in meters: ");
		int meters = input.nextInt();
	
		double inches = meters * METERS_TO_INCHES;
		int feet = (int) inches / INCHES_TO_FEET;
		int miles = (int) feet / FEET_TO_MILES;
		inches = inches - (feet * INCHES_TO_FEET);
		feet = feet - (miles * FEET_TO_MILES);
		
		System.out.print(meters + " meters is ");
		if (miles > 0) {
			System.out.print(miles + " miles, ");
		}
		if (feet > 0 && miles > 0) {
			System.out.print(feet + " feet, and ");
		} else if (feet > 0) {
			System.out.print(feet + " feet and ");
		}
		System.out.printf("%.1f", inches);
		System.out.print(" inches long.");
	}
}

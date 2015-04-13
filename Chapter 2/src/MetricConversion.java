import java.util.Scanner;

public class MetricConversion {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter your measurement in meters: ");
		int meters = input.nextInt();
	
		double inches = meters * 39.3701;
		int feet = (int) inches / 12;
		int miles = (int) feet / 5280;
		inches = inches - (feet * 12);
		feet = feet - (miles * 5280);
		
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

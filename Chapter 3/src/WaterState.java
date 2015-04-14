import java.util.Scanner;

public class WaterState {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		final double BOILING_POINT = 100;
		final double FREEZING_POINT = 0;
		
		System.out.print("Enter a temperature value: ");
		double temperature = input.nextDouble();
		System.out.print("Enter C for Celsius or F for Fahrenheit: ");
		String scale = input.next();
		System.out.print("Enter the altitude: ");
		double altitude = input.nextDouble();
		System.out.print("Enter M for meters or F for feet: ");
		String measurement = input.next();
		
		if (scale.equals("F") || scale.equals("f")) {
			temperature = (temperature - 32) * 5 / 9;
		}
		
		if (measurement.equals("F") || measurement.equals("f")) {
			altitude = altitude * 0.3048;
		}
		
		if (temperature >= (BOILING_POINT - (altitude / 300))) {
			System.out.println("Water is gaseous at this temperature.");
		} else if (temperature <= FREEZING_POINT) {
			System.out.println("Water is solid at this temperature.");
		} else {
			System.out.println("Water is liquid at this temperature.");
		}
	}
}

import java.util.Scanner;

public class DewPointTemperature {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the relative humidity: ");
		double relativeHumidity = input.nextDouble();
		System.out.print("Enter the current temperature in Celsius: ");
		int currentTemperature = input.nextInt();
		
		double a = 17.27;
		double b = 237.7;
		// Td = (b * f(T, RH)) / (a - f(T, RH))
		// f(T, RH) = ((a * T) / (b + T)) + ln(RH);
		double fTRH = ((a * currentTemperature) / (b + currentTemperature)) + Math.log(relativeHumidity);
		double dewPoint = (b * fTRH) / (a - fTRH);
		
		System.out.printf("The dew point is %.2f", dewPoint);
		System.out.printf(" degrees Celsius.");
	}
}

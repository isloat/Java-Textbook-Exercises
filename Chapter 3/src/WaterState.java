import java.util.Scanner;

public class WaterState {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a temperature value: ");
		double temperature = input.nextDouble();
		System.out.print("Enter C for Celsius or F for Fahrenheit: ");
		String scale = input.next();
		
		if (scale.equals("F")) {
			temperature = (temperature - 32) * 5 / 9;
		}
		
		if (temperature >= 100) {
			System.out.println("Water is gaseous at this temperature.");
		} else if (temperature <= 0) {
			System.out.println("Water is solid at this temperature.");
		} else {
			System.out.println("Water is liquid at this temperature.");
		}
	}
}

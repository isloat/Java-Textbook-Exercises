import java.util.Scanner;

public class RadiusInput {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number that will serve as a radius: ");
		double radius = input.nextDouble();
		
		double circleArea = radius * radius * Math.PI; // A = pi * r^2
		double circleCircumference = radius * 2 * Math.PI; // C = pi * 2r
		
		double sphereVolume = 4 / 3 * Math.pow(radius, 3) * Math.PI; // V = 4/3 pi r^3
		double sphereSurfaceArea = 4 * Math.pow(radius,  2) * Math.PI; // A = 4 pi r^2
		
		System.out.println("\nThe radius is " + radius + ".");
		System.out.printf("\nA circle with that radius has %.2f", circleArea);
		System.out.printf(" area and %.2f", circleCircumference);
		System.out.printf(" circumference. \nA sphere with that radius has %.2f", sphereVolume);
		System.out.printf(" volume and %.2f", sphereSurfaceArea);
		System.out.print(" surface area.");
	}
}

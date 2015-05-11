import java.util.*;

/* A catchall for static methods sphereVolume, sphereSurface,
 * cylinderVolume, cylinderSurface, coneVolume, coneSurface
 * that do pretty much what you'd expect.
 * 
 * Also a main method that will prompt user for values of radius and height,
 * run all methods, and print results.
 */
public class Geometry {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double radius = 0;
		double height = 0;
		
		System.out.print("Enter the radius: ");
		radius = input.nextDouble();
		System.out.print("Enter the height: ");
		height = input.nextDouble();
		
		System.out.println("\nWith those dimensions: \n");
		System.out.printf("Sphere volume: %.2f", sphereVolume(radius));
		System.out.printf("\nSphere surface area: %.2f", sphereSurface(radius));
		System.out.printf("\nCylinder volume: %.2f", cylinderVolume(radius, height));
		System.out.printf("\nSphere surface area: %.2f", cylinderSurface(radius, height));
		System.out.printf("\nCone volume: %.2f", coneVolume(radius, height));
		System.out.printf("\nSphere surface area: %.2f", coneSurface(radius, height));
	}
	
	public static double sphereVolume(double radius) {
		double volume = 4 / 3 * Math.PI * Math.pow(radius, 3);
		
		return volume;
	}
	
	public static double sphereSurface(double radius) {
		double surface = 4 * Math.PI * Math.pow(radius, 2);
		
		return surface;
	}
	
	public static double cylinderVolume(double radius, double height) {
		double volume = Math.PI * Math.pow(radius, 2) * height;
		
		return volume;
	}
	
	public static double cylinderSurface(double radius, double height) {
		double surface = 2 * Math.PI * radius * height + 2 * Math.PI * Math.pow(radius, 2);
		
		return surface;
	}
	
	public static double coneVolume(double radius, double height) {
		double volume = Math.PI * Math.pow(radius,  2) * height / 3;
		
		return volume;
	}
	
	public static double coneSurface(double radius, double height) {
		double surface = Math.PI * radius * (radius + Math.sqrt(Math.pow(height,  2) + Math.pow(radius,  2)));
		
		return surface;
	}
}

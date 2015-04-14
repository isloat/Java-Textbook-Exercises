import java.util.Scanner;

public class CircuitResistance {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		/* The circuit in question:
		 *            |
		 *           [1]
		 *            |
		 *          -----
		 *          |   | 
		 *         [2] [3]
		 *          |   |
		 *          -----
		 *            |
		 *            |
		 */
		
		System.out.print("Enter the resistance for Resistor R1: ");
		double r1 = input.nextDouble();
		System.out.print("Enter the resistance for Resistor R2: ");
		double r2 = input.nextDouble();
		System.out.print("Enter the resistance for Resistor R3: ");
		double r3 = input.nextDouble();
		
		double totalResist = r1 + (r2 * r3 / (r2 + r3));
		System.out.println("The total resistance of this circuit is " + totalResist + ".");
	}
}

/* This class has the following properties:
 * 		fuel efficiency (miles per gallon)
 * 		fuel remaining in the gas tank 
 * 
 * Supply a method drive that simulates driving the car for a certain distance, 
 * reducing the fuel in the gas tank, and methods getGasLevel, to return the 
 * current fuel level, and addGas to refuel.
 */
public class Car {
	double efficiency; // in miles per gallon
	double remainingFuel; // in gallons
	
	public Car(double efficiency) {
		this.efficiency = efficiency;
		this.remainingFuel = 0;
	}
	
	public void drive(double distance) {
		this.remainingFuel -= distance / efficiency;
	}
	
	public double getGasLevel() {
		return this.remainingFuel;
	}
	
	public void addGas(double gallons) {
		this.remainingFuel += gallons;
	}
}

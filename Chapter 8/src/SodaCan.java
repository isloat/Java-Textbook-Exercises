/* Implement a class SodaCan with methods getSurfaceArea() and getVolume().
 * In the constructor, supply the height and radius of the can.
 */
public class SodaCan {
	double sodaHeight;
	double sodaRadius;
	
	public SodaCan(double sodaHeight, double sodaRadius) {
		this.sodaHeight = sodaHeight;
		this.sodaRadius = sodaRadius;
	}

	public double getSurfaceArea() {
		double surfaceArea = 2 * Math.PI * sodaRadius * sodaHeight + 2 * Math.PI * Math.pow(sodaRadius, 2);
		
		return surfaceArea;
	}
	
	public double getVolume() {
		double volume = Math.PI * Math.pow(sodaRadius, 2) * sodaHeight;
		
		return volume;
	}
}

/* Extension of Bug class.
 * 
 * Zeno's moth will fly in a straight line towards a position. Each movement 
 * will put it halfway between its destination and its origination.
 */
public class Moth {
	// Tester for the Moth class.
	public static void main(String[] args) {
		Moth venomoth = new Moth(100);
		venomoth.moveToLight(50); // 75
		venomoth.moveToLight(125); // 100;
		venomoth.moveToLight(200); // 150;
		venomoth.moveToLight(0); // 75;
		
		System.out.println("Expected position of Venomoth: 75");
		System.out.println("Actual position of Venomoth: " + venomoth.getPosition());
	}

	double position;
	
	public Moth(double initialPosition) {
		this.position = initialPosition;
	}
	
	public void moveToLight(double lightPosition) {
		if (position > lightPosition) {
			position -= (position - lightPosition) / 2;
		} else {
			position += (lightPosition - position) / 2;
		}
	}
	
	public double getPosition() {
		return position;
	}
}

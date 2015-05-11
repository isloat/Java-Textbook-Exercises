/* A class that models a bug moving along a horizontal line.
 * 
 * The bug moves either to the right or left. 
 */
public class Bug {
	public static void main(String[] args) {
		Bug heracross = new Bug(10);
		heracross.move();
		heracross.move();
		heracross.move();
		heracross.turn();
		heracross.move();
		heracross.turn();
		heracross.move();
		
		System.out.println("Expected position: 13");
		System.out.println("Actual position: " + heracross.getPosition());
	}
	
	int position;
	boolean direction; // TRUE = right, FALSE = left
	
	public Bug(int initialPosition) {
		this.position = initialPosition;
		this.direction = true;
	}
	
	public void turn() {
		direction = !direction;
	}
	
	public void move() {
		if (direction) position++;
		else position--;
	}
	
	public int getPosition() {
		return position;
	}
}

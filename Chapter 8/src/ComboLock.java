/* An object that works like a combination lock.
 * 
 * The combination consists of three numbers between 0 and 39.
 * 
 * It has a reset method, turnLeft and turnRight, and open methods.
 */
public class ComboLock {
	final int MAX_NUMBER = 39;
	
	int combo1;
	int combo2;
	int combo3;
	int currentPosition;
	int turnCount;
	boolean combo1Reach;
	boolean combo2Reach;
	boolean combo3Reach;
	
	public ComboLock(int combo1, int combo2, int combo3) {
		this.combo1 = combo1;
		this.combo2 = combo2;
		this.combo3 = combo3;
		this.turnCount = 0;
		this.currentPosition = 0;
		this.combo1Reach = false;
		this.combo2Reach = false;
		this.combo3Reach = false;
	}
	
	public void reset() {
		this.currentPosition = 0;
	}
	
	public void turnLeft(int degrees) {
		do {
			if (degrees - 1 > this.currentPosition) {
				this.currentPosition = MAX_NUMBER;
				degrees -= this.currentPosition + 1;
			} else {
				this.currentPosition -= degrees;
				degrees = 0;
			}
		} while (degrees > 0);
		
		turnCount++;
		combo2Reach = turnCheck();
		countCheck();
	}
	
	public void turnRight(int degrees) {
		do {
			if (degrees > (MAX_NUMBER - this.currentPosition)) {
				this.currentPosition = 0;
				degrees -= (MAX_NUMBER - this.currentPosition) + 1;
			} else {
				this.currentPosition += degrees;
				degrees = 0;
			}
		} while (degrees > 0);
		
		turnCount++;
		combo1Reach = turnCheck();
		combo3Reach = turnCheck();
		countCheck();
	}
	
	private boolean turnCheck() {
		if (turnCount == 1 && currentPosition == combo1) {
			return true;
		} else if (turnCount == 2 && currentPosition == combo2) {
			return true;
		} else if (turnCount == 3 && currentPosition == combo3) {
			return true;
		} else return false;
	}
	
	private void countCheck() {
		if (turnCount > 3) {
			turnCount = 0;
			combo1Reach = false;
			combo2Reach = false;
			combo3Reach = false;
		}
	}
	
	public boolean open() {
		if (combo1Reach && combo2Reach && combo3Reach) return true;
		
		return false;
	}
}

/* This will simulate a tally counter that admits a limited number of people.
 * Set the limit with a call to setLimit(int maximum).
 * If count surpasses the limit, alert by printing "Limit exceeded."
 * 
 * This modifies Exercise 8.2.
 */
public class TallyCounter {
	private int value;
	private int maximum;
	
	public int getValue() {
		return value;
	}
	
	public void setLimit(int maximum) {
		this.maximum = maximum;
	}
	
	public void count() {
		if (value + 1 > maximum) {
			System.out.println("Limit exceeded.");
		} else value++;
	}
	
	public void undo() {
		if (value > 0) {
			value --;
		}
	}
}


public class LabeledPoint {
	int x;
	int y;
	String label;
	
	public LabeledPoint(int x, int y, String label) {
		this.x = x;
		this.y = y;
		this.label = label;
	}
	
	public String toString() {
		return String.format("%s [x = %d, y = %d, label = %s]", getClass().getName(), this.x, this.y, this.label);
	}
}

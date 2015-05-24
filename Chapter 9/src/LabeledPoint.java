import java.awt.Point;

public class LabeledPoint extends Point {
	private String label;
	
	public LabeledPoint(int x, int y, String label) {
		super(x, y);
		this.label = label;
	}
	
	public String toString() {
		return super.toString() + ", label = " + this.label;
	}
}

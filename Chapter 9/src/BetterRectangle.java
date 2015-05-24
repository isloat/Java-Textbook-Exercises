import java.awt.Rectangle;

public class BetterRectangle extends Rectangle {
	public BetterRectangle(int x, int y, int width, int height) {
		super(x, y, width, height);
	}
	
	public double getPerimeter() {
		return (super.getWidth() * 2 + super.getHeight() * 2);
	}
	
	public double getArea() {
		return (super.getWidth() * super.getHeight());
	}
}

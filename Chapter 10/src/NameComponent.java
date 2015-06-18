import java.util.*;
import java.awt.*;
import java.awt.geom.Rectangle2D;

import javax.swing.*;

/*
 * 10.14: Write a graphics program that draws your name in red, 
 * contained inside a blue rectangle. Provide a class NameViewer
 * and a class NameComponent.
 */
public class NameComponent extends JComponent {
	public void paint(Graphics graphics) {
		Graphics2D graphics2 = (Graphics2D) graphics;
		
		int width = this.getWidth() - 10;
		int height = this.getHeight() - 10;
		int x = 5;
		int y = 5;
		graphics2.setColor(Color.blue);
		graphics2.fillRect(x, y, width, height);
		graphics2.drawRect(x, y, width, height);
		
		String name = "Isaac Sloat";
		Rectangle2D stringBounds = graphics2.getFontMetrics().getStringBounds(name, graphics2);
		
		x = (int) (x + width / 2 - stringBounds.getCenterX());
	    y = (int) (y + height / 2 - stringBounds.getCenterY());
	    graphics2.setColor(Color.red);
	    graphics2.drawString(name, x, y);
	}
}

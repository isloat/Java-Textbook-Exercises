import java.util.*;
import java.awt.*;
import java.awt.geom.Rectangle2D;

import javax.swing.*;

/*
 * 10.15: Write a graphics program that draws 12 strings, one each
 * for the 12 standard colors besides Color.WHITE, each in its own
 * color. Provide a class ColorNameViewer and a class ColorNameComponent. 
 */
public class ColorNameComponent extends JComponent {
	public void paint(Graphics graphics) {
		Graphics2D graphics2 = (Graphics2D) graphics;
		
		int width = this.getWidth() - 10;
		int height = this.getHeight() - 10;
		int x = 5;
		int y = 5;
		graphics2.setColor(Color.blue);
		graphics2.fillRect(x, y, width, height);
		graphics2.drawRect(x, y, width, height);
		
		// All the Standard colors from Java.awt.Color, except for WHITE.
		String colorName1 = "BLACK";
		String colorName2 = "BLUE";
		String colorName3 = "CYAN";
		String colorName4 = "DARK GRAY";
		String colorName5 = "GRAY";
		String colorName6 = "GREEN";
		String colorName7 = "LIGHT GRAY";
		String colorName8 = "MAGENTA";
		String colorName9 = "ORANGE";
		String colorNameA = "PINK";
		String colorNameB = "RED";
		String colorNameC = "YELLOW";
		
		Rectangle2D stringBounds = graphics2.getFontMetrics().getStringBounds(name, graphics2);
		
		x = (int) (x + width / 2 - stringBounds.getCenterX());
	    y = (int) (y + height / 2 - stringBounds.getCenterY());
	    graphics2.setColor(Color.red);
	    graphics2.drawString(name, x, y);
	}
}

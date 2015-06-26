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
		graphics2.setColor(new Color(156, 93, 82));
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
		
		Rectangle2D stringBounds = graphics2.getFontMetrics().getStringBounds(colorName7, graphics2);
		
		// A very messy list of all the names.
		// TODO: Figure out how to clean this up. 
		x = (int) (x + width / 2 - stringBounds.getCenterX());
	    y = (int) (height / 6);
	    graphics2.setColor(Color.BLACK);
	    graphics2.drawString(colorName1, x, y);
	    y += 15;
	    graphics2.setColor(Color.BLUE);
	    graphics2.drawString(colorName2, x, y);
	    y += 15;
	    graphics2.setColor(Color.CYAN);
	    graphics2.drawString(colorName3, x, y);
	    y += 15;
	    graphics2.setColor(Color.DARK_GRAY);
	    graphics2.drawString(colorName4, x, y);
	    y += 15;
	    graphics2.setColor(Color.GRAY);
	    graphics2.drawString(colorName5, x, y);
	    y += 15;
	    graphics2.setColor(Color.GREEN);
	    graphics2.drawString(colorName6, x, y);
	    y += 15;
	    graphics2.setColor(Color.LIGHT_GRAY);
	    graphics2.drawString(colorName7, x, y);
	    y += 15;
	    graphics2.setColor(Color.MAGENTA);
	    graphics2.drawString(colorName8, x, y);
	    y += 15;
	    graphics2.setColor(Color.ORANGE);
	    graphics2.drawString(colorName9, x, y);
	    y += 15;
	    graphics2.setColor(Color.PINK);
	    graphics2.drawString(colorNameA, x, y);
	    y += 15;
	    graphics2.setColor(Color.RED);
	    graphics2.drawString(colorNameB, x, y);
	    y += 15;
	    graphics2.setColor(Color.YELLOW);
	    graphics2.drawString(colorNameC, x, y);
	    y += 15;
	}
}

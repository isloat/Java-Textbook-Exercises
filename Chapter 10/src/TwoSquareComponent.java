import java.util.*;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Rectangle2D;

import javax.swing.*;

/*
 * 10.16: Write a  program that draws two solid squares: one in pink and one in purple.
 * Use a standard color for one of them and a custom color for the second. Provide a
 * class TwoSquareViewer and a class TwoSquareComponent.
 */
public class TwoSquareComponent extends JComponent {
	public void paint(Graphics graphics) {
		Graphics2D graphics2 = (Graphics2D) graphics;
		
		int squareSize = this.getWidth() / 5;
		int x = 5;
		int y = this.getHeight() / 4;
		graphics2.setColor(Color.PINK);
		graphics2.drawRect(x, y, squareSize, squareSize);
		graphics2.fillRect(x, y, squareSize, squareSize);
		
		Color purple = new Color(127, 0, 255);
		graphics2.setColor(purple);
		graphics2.drawRect((int) ((x + squareSize) * 1.5), y, squareSize, squareSize);
		graphics2.fillRect((int) ((x + squareSize) * 1.5), y, squareSize, squareSize);
	}
}

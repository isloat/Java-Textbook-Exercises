import java.util.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

/*
 * 10.15: Write a graphics program that draws 12 strings, one each
 * for the 12 standard colors besides Color.WHITE, each in its own
 * color. Provide a class ColorNameViewer and a class ColorNameComponent. 
 */
public class ColorNameViewer {
	public static void main(String[] args) {
		JFrame testFrame = new JFrame();
		
		testFrame.setSize(200, 250);
		testFrame.setTitle("Name Viewer");
		testFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		ColorNameComponent component = new ColorNameComponent();
		testFrame.add(component);
		testFrame.setVisible(true);
	}
}

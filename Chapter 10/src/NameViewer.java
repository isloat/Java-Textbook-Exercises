import java.util.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

/*
 * 10.14: Write a graphics program that draws your name in red, 
 * contained inside a blue rectangle. Provide a class NameViewer
 * and a class NameComponent.
 */
public class NameViewer {
	public static void main(String[] args) {
		JFrame testFrame = new JFrame();
		
		testFrame.setSize(300, 100);
		testFrame.setTitle("Name Viewer");
		testFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		NameComponent component = new NameComponent();
		testFrame.add(component);
		testFrame.setVisible(true);
	}
}

import java.util.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

/*
 * 10.16: Write a  program that draws two solid squares: one in pink and one in purple.
 * Use a standard color for one of them and a custom color for the second. Provide a
 * class TwoSquareViewer and a class TwoSquareComponent.
 */
public class TwoSquareViewer {
	public static void main(String[] args) {
		JFrame testFrame = new JFrame();
		
		testFrame.setSize(200, 275);
		testFrame.setTitle("Viewer for Two Squares");
		testFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		TwoSquareComponent component = new TwoSquareComponent();
		testFrame.add(component);
		testFrame.setVisible(true);
	}
}

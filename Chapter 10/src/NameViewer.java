import java.util.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

/*
 * 10.14: Write a graphics program that draws your name in red, 
 * contained inside a blue rectangle. Provide a class NameViewer
 * and a class NameComponent.
 */
public class NameViewer extends JFrame {
	private static final int FRAME_WIDTH = 300;
	private static final int FRAME_HEIGHT = 100;
	
	public static void main(String[] args) {
		JFrame testFrame = new NameViewer();
	}
	
	public NameViewer() {
		this.createComponents();
		this.setSize(FRAME_WIDTH, FRAME_HEIGHT);
		this.setVisible(true);
	}
	
	public void createComponents() {
		
	}
}

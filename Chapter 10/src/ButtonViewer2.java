import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JLabel;

public class ButtonViewer2 extends JFrame {
	private static final int FRAME_WIDTH = 300;
	private static final int FRAME_HEIGHT = 100;
	
	public ButtonViewer2() {
		this.createComponents();
		this.setSize(FRAME_WIDTH, FRAME_HEIGHT);
		this.setVisible(true);
	}
	
	private void createComponents() {
		JButton button = new JButton("Click me.");
		JLabel label = new JLabel("Hello, World!");
		
		ActionListener listener = new ClickListener2(label);
		
		button.addActionListener(listener);
		
		JPanel panel = new JPanel();
		panel.add(button);
		panel.add(label);
		add(panel);
	}
	
	public static void main(String[] args) {
		JFrame testFrame = new ButtonViewer2();
	}
}

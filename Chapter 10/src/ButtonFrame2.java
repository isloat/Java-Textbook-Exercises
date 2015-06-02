import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ButtonFrame2 extends JFrame {
	
	private static final int FRAME_WIDTH = 300;
	private static final int FRAME_HEIGHT = 100;
	
	public ButtonFrame2() {
		createComponents();
		setSize(FRAME_WIDTH, FRAME_HEIGHT);
	}
	
	private void createComponents() {
		JButton button = new JButton("Alpha");
		JButton button2 = new JButton("Beta");
		
		ActionListener listener = new ClickListener("Alpha");
		ActionListener listener2 = new ClickListener("Beta");
		button.addActionListener(listener);
		button2.addActionListener(listener2);
		
		JPanel panel = new JPanel();
		panel.add(button);
		panel.add(button2);
		add(panel);
	}
	
	class ClickListener implements ActionListener {
		// private int n;
		private String label;
		
		public ClickListener(String label) {
			this.label = label;
		}
		
		public void actionPerformed(ActionEvent event) {
			// n++;
			// System.out.println("I was clicked " + n + " time" + (n >= 2? "s." : "."));
			System.out.println("Button " + label + " was clicked.");
		}
	}
}
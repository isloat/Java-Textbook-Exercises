import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ButtonFrame2 extends JFrame {
	
	private static final int FRAME_WIDTH = 300;
	private static final int FRAME_HEIGHT = 300;
	
	public ButtonFrame2() {
		createComponents();
		setSize(FRAME_WIDTH, FRAME_HEIGHT);
	}
	
	private void createComponents() {
		JButton button = new JButton("Click me.");
		JButton button2 = new JButton("Click me too.");
		
		ActionListener listener = new ClickListener();
		ActionListener listener2 = new ClickListener();
		button.addActionListener(listener);
		button2.addActionListener(listener2);
		
		JPanel panel = new JPanel();
		panel.add(button);
		panel.add(button2);
		add(panel);
	}
	
	class ClickListener implements ActionListener {
		private int n;
		
		public void actionPerformed(ActionEvent event) {
			n++;
			System.out.println("I was clicked " + n + " time" + (n >= 2? "s." : "."));
		}
	}
}
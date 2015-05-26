import java.awt.event.*;

import javax.swing.*;

public class ButtonFrame2 extends JFrame {
	private JButton button;
	private JLabel label;
	
	private static final int FRAME_WIDTH = 300;
	private static final int FRAME_HEIGHT = 300;
	
	public ButtonFrame2() {
		createComponents();
		setSize(FRAME_WIDTH, FRAME_HEIGHT);
	}
	
	private void createComponents() {
		button = new JButton("Click me.");
		ActionListener listener = new ClickListener();
		button.addActionListener(listener);
		
		label = new JLabel("Hello, world.");
		
		JPanel panel = new JPanel();
		panel.add(button);
		panel.add(label);
		add(panel);
	}
	
	class ClickListener implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			label.setText("I was clicked.");
		}
	}
	
	public static void main(String[] args) {
		JFrame frame = new ButtonFrame1();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
import javax.swing.*;

public class SquareFrameButtons extends JFrame {
	public SquareFrameButtons() {
		JPanel panel = new JPanel();
	
		for (int i = 1; i < 101; i++) {
			JButton button = new JButton("" + i);
			panel.add(button);
		}
		
		this.add(panel);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500, 400);
		this.setVisible(true);
	}
}

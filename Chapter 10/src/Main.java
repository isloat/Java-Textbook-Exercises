import javax.swing.*;

/* For testing.
 * 
 */
public class Main {
	public static void main(String[] args) {
		// JFrame testFrame = (JFrame) new SquareFrameButtons();
		
		JFrame frame = new FilledFrame();
		frame.setTitle("A frame with two components");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}

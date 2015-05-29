import javax.swing.JComponent;
import javax.swing.JFrame;

public class ChartViewer2 {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		
		frame.setSize(400, 200);
		frame.setTitle("Another bar chart");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JComponent component = new ChartComponent2();
		frame.add(component);
		
		frame.setVisible(true);
	}
}

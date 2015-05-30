import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class InvestmentFrame4 extends JFrame {
	private static final int FRAME_WIDTH = 400;
	private static final int FRAME_HEIGHT = 400;
	
	private static final int CHART_WIDTH = 300;
	private static final int CHART_HEIGHT = 300;
	
	private static final double DEFAULT_RATE = 5;
	private static final double INITIAL_BALANCE = 1000;
	
	private JLabel rateLabel;
	private JTextField rateField;
	private JButton button;
	private ChartComponent3 chart;
	private double balance;
	
	public InvestmentFrame4() {
		balance = INITIAL_BALANCE;
		chart = new ChartComponent3(3 * INITIAL_BALANCE);
		chart.setPreferredSize(new Dimension(CHART_WIDTH, CHART_HEIGHT));
		chart.append(INITIAL_BALANCE);
		
		createTextField();
		createButton();
		createPanel();
		
		setSize(FRAME_WIDTH, FRAME_HEIGHT);
	}
	
	private void createTextField() {
		rateLabel = new JLabel("Interest Rate: ");
		
		final int FIELD_WIDTH = 10;
		rateField = new JTextField(FIELD_WIDTH);
		rateField.setText("" + DEFAULT_RATE);
	}
	
	class AddInterestListener implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			double rate = Double.parseDouble(rateField.getText());
			double interest = balance * rate / 100;
			balance += interest;
			chart.append(balance);
		}
	}
	
	private void createButton() {
		button = new JButton("Add Interest");
		
		ActionListener listener = new AddInterestListener();
		button.addActionListener(listener);
	}
	
	private void createPanel() {
		JPanel panel = new JPanel();
		panel.add(rateLabel);
		panel.add(rateField);
		panel.add(button);
		panel.add(chart);
		add(panel);
	}
}

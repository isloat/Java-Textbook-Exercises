import java.awt.event.*;
import javax.swing.*;

public class InvestmentFrame3 extends JFrame {
	private static final int FRAME_WIDTH = 400;
	private static final int FRAME_HEIGHT = 250;
	
	private static final int AREA_ROWS = 10;
	private static final int AREA_COLUMNS = 30;
	
	private static final double DEFAULT_RATE = 5;
	private static final double INITIAL_BALANCE = 1000;
	
	private JLabel rateLabel;
	private JTextField rateField;
	private JButton button;
	private JTextArea resultArea;
	private double balance;
	
	public InvestmentFrame3() {
		balance = INITIAL_BALANCE;
		resultArea = new JTextArea(AREA_ROWS, AREA_COLUMNS);
		resultArea.setText(balance + "\n");
		resultArea.setEditable(false);
		
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
			balance = balance + interest;
			resultArea.append(balance + "\n");
		}
	}
	
	private void createButton() {
		button = new JButton("Add Interest: ");
		
		ActionListener listener = new AddInterestListener();
		button.addActionListener(listener);
	}
	
	private void createPanel() {
		JPanel panel = new JPanel();
		panel.add(rateLabel);
		panel.add(rateField);
		panel.add(button);
		JScrollPane scrollPane = new JScrollPane(resultArea);
		panel.add(scrollPane);
		add(panel);
	}
}

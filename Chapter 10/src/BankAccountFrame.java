import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

/*  10.9: Create a graphical app simulating a bank account.
 *  Supply text fields and buttons for deposit/withdraw,
 *  and to display current balance in a label.
 */

public class BankAccountFrame extends JFrame {
	private static final int FRAME_WIDTH = 500;
	private static final int FRAME_HEIGHT = 500;
	
	private static final double INITIAL_BALANCE = 1000;
	private double balance;
	
    private JButton withdrawButton;
    private JButton depositButton;
    private JLabel balanceLabel;
    private JLabel currentBalanceLabel;
    private JLabel amountLabel;
    private JTextField amountField;
    
    public static void main(String[] args) {
    	JFrame testFrame = new BankAccountFrame();
    }
	
	public BankAccountFrame() {
		this.balance = INITIAL_BALANCE;
		
		this.createComponents();
		this.createPanel();
		this.setSize(FRAME_WIDTH, FRAME_HEIGHT);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
	private void createComponents() {
		amountLabel = new JLabel("Number amount: ");
		currentBalanceLabel = new JLabel(String.valueOf(balance));
		
		this.createButtons();
		this.createTextField();
		
		balanceLabel = new JLabel("Balance: ");
	}
	
	private void createButtons() {
		depositButton = new JButton("Deposit");
		ActionListener depositListener = new AddRemoveAmountListener("deposit");
		depositButton.addActionListener(depositListener);
		
		withdrawButton = new JButton("Withdraw");
		ActionListener withdrawListener = new AddRemoveAmountListener("withdraw");
		withdrawButton.addActionListener(withdrawListener);
	}
	
	class AddRemoveAmountListener implements ActionListener {
		private String action;
		
		public AddRemoveAmountListener(String action) {
			this.action = action.toLowerCase();
		}
		
		public void actionPerformed(ActionEvent e) {
			try {
				double amount = Double.parseDouble(amountField.getText());
				
				if (amount < 0) {
					throw new IllegalArgumentException();
				}
				
				if (action.equals("deposit")) {
					balance += amount;
					currentBalanceLabel.setText(String.valueOf(balance));
				} else if (action.equals("withdraw")) {
					if (balance - amount >= 0) {
						balance -= amount;
						currentBalanceLabel.setText(String.valueOf(balance));
					} else {
						throw new IllegalArgumentException();
					}
				}
			} catch (Exception except) {
				JOptionPane.showMessageDialog(null, "Amount must be a positive number. " 
						+ "Withdrawn amount must also be less or equal to current balance.",
						"Invalid number!", JOptionPane.WARNING_MESSAGE);
			}
		}
	}
	
	private void createTextField() {
		final int FIELD_WIDTH = 9;
		
		amountField = new JTextField(FIELD_WIDTH);
		amountField.setText("");
	}
	
	private void createPanel() {
        JPanel panel = new JPanel();
        
        panel.add(this.withdrawButton);
        panel.add(this.amountLabel);
        panel.add(this.amountField);
        panel.add(this.depositButton);
        panel.add(this.balanceLabel);
        panel.add(this.currentBalanceLabel);
        
        this.add(panel);
	}
}

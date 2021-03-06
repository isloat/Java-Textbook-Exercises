import java.util.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

/*  10.12: Write an application with three labeled text fields,
 *  one each for the initial amount of a savings account, the 
 *  annual interest rate, and the number of years. Add a button
 *  "Calculate" and a read-only text area to display the balance of the 
 *  savings account after the end of each year.
 */
public class CalculateSavings extends JFrame {
    private static final int FRAME_WIDTH = 300;
    private static final int FRAME_HEIGHT = 500;
    
    // Declare our labels, input field, and output text area.
    // And also the button to engage.
    private JLabel inputBalanceLabel;
    private JLabel inputInterestRateLabel;
    private JLabel inputYearsLabel;
    private JTextField inputBalanceField;
    private JTextField inputInterestRateField;
    private JTextField inputYearsField;
    private JButton calculateButton;
    private JTextArea outputArea;
    
    // Testing.
    public static void main(String[] args) {
        JFrame testFrame = new CalculateSavings();
    }
    
    // Create frame, components, and set attributes.
    public CalculateSavings() {
        this.createComponents();
        this.createPanel();
        
        this.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
    
    // Create labels and initialize button creation.
    private void createComponents() {
        final int INPUT_FIELD_SIZE = 10;
        
        this.inputBalanceLabel = new JLabel("Initial balance: ");
        this.inputBalanceField = new JTextField(INPUT_FIELD_SIZE);
        this.inputInterestRateLabel = new JLabel("Annual interest rate: ");
        this.inputInterestRateField = new JTextField(INPUT_FIELD_SIZE);
        this.inputYearsLabel = new JLabel("Number of years: ");
        this.inputYearsField = new JTextField(INPUT_FIELD_SIZE);
        
        this.outputArea = new JTextArea(15, 20);
        this.outputArea.setEditable(false);
        
        this.createButton();
    }
    
    // Create button and action listeners.
    private void createButton() {
        this.calculateButton = new JButton("Calculate");
        this.calculateButton.addActionListener(new ActionListener() {
        	
        	// Take input from the fields, and run calculations based on them.
        	// Interest will accrue yearly. 
        	// Each separate year's balance will go in outputArea.
            public void actionPerformed(ActionEvent e) {
            	double initialBalance = Double.parseDouble(inputBalanceField.getText());
            	double interestRate = Double.parseDouble(inputInterestRateField.getText());
            	double years = Double.parseDouble(inputYearsField.getText());
            	double balanceAccrued = initialBalance;
            	
            	String balanceOverTime = "Initial balance: " + balanceAccrued;
            	
            	for (int i = 1; i <= years; i++) {
            		balanceAccrued += balanceAccrued * interestRate;
            		balanceAccrued = Math.floor(balanceAccrued * 100) / 100;
            		balanceOverTime += "\nYear " + i + " balance: " + balanceAccrued;
            	}
            	
            	outputArea.setText(balanceOverTime);
            }
        });
    }
    
    // Set and enable everything.
    private void createPanel() {
        JPanel panel = new JPanel();
        
        panel.add(this.inputBalanceLabel);
        panel.add(this.inputBalanceField);
        panel.add(this.inputInterestRateLabel);
        panel.add(this.inputInterestRateField);
        panel.add(this.inputYearsLabel);
        panel.add(this.inputYearsField);
        
        panel.add(this.calculateButton);
        
        panel.add(this.outputArea);
        
        this.add(panel);
    }
}

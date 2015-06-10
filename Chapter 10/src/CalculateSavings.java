import java.util.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

/*  10.12: Create a graphical app for computing statistics of a data set.
 *  Supply text fields and buttons for adding floating point values. Display the
 *  current minimum, maximum, and average in a label.
 */
public class CalculateSavings extends JFrame {
    private static final int FRAME_WIDTH = 300;
    private static final int FRAME_HEIGHT = 500;
    
    private JLabel inputInitialBalanceLabel;
    private JLabel inputAnnualInterestRate;
    private JLabel inputNumberYears;
    private JTextField inputInitialBalanceLabelField;
    private JTextField inputAnnualInterestRateField;
    private JTextField inputNumberYearsField;
    private JButton calculateButton;
    
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
        
        this.inputInitialBalanceLabel = new JLabel("Initial balance: ");
        this.inputInitialBalanceLabelField = new JTextField(INPUT_FIELD_SIZE);
        this.inputAnnualInterestRate = new JLabel("Annual interest rate: ");
        this.inputAnnualInterestRateField = new JTextField(INPUT_FIELD_SIZE);
        this.inputNumberYears = new JLabel("Number of years: ");
        this.inputNumberYearsField = new JTextField(INPUT_FIELD_SIZE);
        
        this.createButton();
    }
    
    // Create button and action listeners.
    private void createButton() {
        this.calculateButton = new JButton("Calculate");
        this.calculateButton.addActionListener(new ActionListener() {
        	
            public void actionPerformed(ActionEvent e) {
                try {
                } catch (Exception exception) {
                }
            }
        });
    }
    
    // Set and enable everything.
    private void createPanel() {
        JPanel panel = new JPanel();
        
        panel.add(this.inputInitialBalanceLabel);
        panel.add(this.inputInitialBalanceLabelField);
        panel.add(this.inputAnnualInterestRate);
        panel.add(this.inputAnnualInterestRateField);
        panel.add(this.inputNumberYears);
        panel.add(this.inputNumberYearsField);
        
        panel.add(this.calculateButton);
    }
}

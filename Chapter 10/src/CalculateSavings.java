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
    	
    }
    
    private void createPanel() {
    	
    }
}

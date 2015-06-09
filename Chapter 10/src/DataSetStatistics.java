import java.util.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

/*  10.9: Create a graphical app for computing statistics of a data set.
 *  Supply text fields and buttons for adding floating point values. Display the
 *  current minimum, maximum, and average in a label.
 */

public class DataSetStatistics extends JFrame {
    private static final int FRAME_WIDTH = 300;
    private static final int FRAME_HEIGHT = 150;
    
    private JLabel inputLabel;
    private JTextField inputField;
    private JButton submitButton;
    
    private JLabel minValueLabel;
    private JLabel minValue;
    private JLabel maxValueLabel;
    private JLabel maxValue;
    private JLabel averageValueLabel;
    private JLabel averageValue;
    
    private boolean firstMinimum = true; // Toggle once the first number has been entered.
    
    private List<Double> numbers;
    
    // Testing.
    public static void main(String[] args) {
        JFrame testFrame = new DataSetStatistics();
    }

    // Create frame, components, and set attributes.
    public DataSetStatistics() {
        numbers = new ArrayList<Double>();
        
        this.createComponents();
        this.createPanel();
        
        this.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    // Create labels and initialize button creation.
    private void createComponents() {
        final int INPUT_FIELD_SIZE = 10;
        
        this.inputLabel = new JLabel("Number: ");
        this.inputField = new JTextField(INPUT_FIELD_SIZE);
        
        this.minValueLabel = new JLabel("Min: ");
        this.minValue = new JLabel("0");
        
        this.maxValueLabel = new JLabel("Max: ");
        this.maxValue = new JLabel("0");
        
        this.averageValueLabel = new JLabel("Average: ");
        this.averageValue = new JLabel("0");
        
        this.createButton();
    }

    // Create button and action listener.
    private void createButton() {
        this.submitButton = new JButton("Submit");
        this.submitButton.addActionListener(new ActionListener() {
        	
            public void actionPerformed(ActionEvent e) {
                try {
                    double inputNumber = Double.parseDouble(inputField.getText());
                    
                    if (firstMinimum) {
                    	minValue.setText(String.valueOf(inputNumber));
                    	firstMinimum = false;
                    }
                    
                    if (inputNumber < Double.parseDouble(minValue.getText())) {
                        minValue.setText(String.valueOf(inputNumber));
                    } else if (inputNumber > Double.parseDouble(maxValue.getText())) {
                        maxValue.setText(String.valueOf(inputNumber));
                    }
                    
                    numbers.add(inputNumber);
                    averageValue.setText(String.valueOf(setSum() / numbers.size()));
                } catch (Exception exception) {
                    JOptionPane.showMessageDialog(null, "Not a number!", "Invalid input", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }

    // Track sum for calculations.
    private double setSum() {
        double sum = 0;
        
        for (double number : this.numbers) {
            sum += number;
        }
        
        return sum;
    }

    // Set and enable everything.
    private void createPanel() {
        JPanel panel = new JPanel();
        
        panel.add(this.inputLabel);
        panel.add(this.inputField);
        panel.add(this.submitButton);
        
        panel.add(this.minValueLabel);
        panel.add(this.minValue);
        panel.add(this.maxValueLabel);
        panel.add(this.maxValue);
        panel.add(this.averageValueLabel);
        panel.add(this.averageValue);
        
        this.add(panel);
    }
}
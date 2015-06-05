import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

/*  10.9: Create a graphical app describing an earthquake.
 *  Supply text fields and buttons for strength of the earthquake,
 *  and to describe earthquake strength in a label.
 */

public class EarthquakeDescription extends JFrame {
    private static final int FRAME_WIDTH = 750;
    private static final int FRAME_HEIGHT = 250;
    
    private JLabel fieldLabel;
    private JTextField magnitudeField;
    private JButton displayButton;
    private JLabel earthquakeDescription;
    
    public static void main(String[] args) {
        JFrame testFrame = new EarthquakeDescription();
    }
    
    public EarthquakeDescription() {
        this.createComponents();
        this.createPanel();
        this.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    private void createComponents() {
        this.fieldLabel = new JLabel("Magnitude: ");
        
        final int MAGNITUDE_FIELD_SIZE = 5;
        this.magnitudeField = new JTextField(MAGNITUDE_FIELD_SIZE);
        this.earthquakeDescription = new JLabel("");
        
        this.createDisplayButton();
    }

    private void createDisplayButton() {
        displayButton = new JButton("Display: ");
        displayButton.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                try {
                    double magnitude = Double.parseDouble(magnitudeField.getText());
                    earthquakeDescription.setText(new Earthquake(magnitude).getDescription());
                } catch (IllegalArgumentException exception) {
                    JOptionPane.showMessageDialog(null, "Magnitude must be a number", "Invalid magnitude",
                            JOptionPane.ERROR_MESSAGE);
                } catch (Exception exception) {
                    JOptionPane.showMessageDialog(null, "Enter a magnitude greater than 0.",
                            "Invalid magnitude level", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }

    private void createPanel() {
        JPanel panel = new JPanel();
        
        panel.add(this.fieldLabel);
        panel.add(this.magnitudeField);
        panel.add(this.displayButton);
        panel.add(this.earthquakeDescription);
        
        this.add(panel);
    }

    class Earthquake {
        private String description;
        private double magnitudeLevel;

        public Earthquake(double magnitudeLevel) throws Exception {
            this.magnitudeLevel = magnitudeLevel;
            this.createDescription();
        }

        private void createDescription() throws Exception {
            if (magnitudeLevel <= 0) {
                throw new Exception();
            } else if (magnitudeLevel <= 2.0) {
            	this.description = "Microearthquakes, not felt, or felt rarely by sensitive people. Recorded by seismographs.";
            } else if (magnitudeLevel <= 2.9) {                
            	this.description = "Felt slightly by some people. No damage to buildings.";
            } else if (magnitudeLevel <= 3.9) {
            	this.description = "Often felt by people, but very rarely causes damage. Shaking of indoor objects can be noticeable.";
            } else if (magnitudeLevel <= 4.9) {
            	this.description = "Noticeable shaking indoors. Felt by most people. Generally causes minimal to no damage.";
            } else if (magnitudeLevel <= 5.9) {
                this.description = "Can cause damage of varying severity to poorly constructed buildings. Felt by everyone.";
            } else if (magnitudeLevel <= 6.9) {
                this.description = "Strong to violent shaking in epicentral area. Felt in wider areas; up to hundreds of miles/kilometers from the epicenter.";
            } else if (magnitudeLevel <= 7.9) {
                this.description = "Causes damage to most buildings, some to partially or completely collapse or receive severe damage.";
            } else if (magnitudeLevel <= 8.9) {
            	this.description = "Major damage to buildings, structures likely to be destroyed. Felt in extremely large regions.";
            } else {
                this.description = "Near total destruction - severe damage to all buildings, and permanent changes in ground topography.";
            }
        }

        public String getDescription() {
            return this.description;
        }
    }
}
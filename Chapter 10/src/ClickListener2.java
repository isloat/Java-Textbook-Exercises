import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;

class ClickListener2 implements ActionListener {
	private JLabel label;
	
	public ClickListener2(JLabel label) {
		this.label = label;
	}
	
	public void actionPerformed(ActionEvent event) {
		label.setText("I was clicked.");
	}
}
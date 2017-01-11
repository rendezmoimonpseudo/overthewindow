import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class MonBouton extends JButton implements ActionListener {
	
	String dflt;
	
	public MonBouton(String label){
		super(label);
		addActionListener(this);
		dflt = label;
	}
	
	public void actionPerformed(ActionEvent arg0) {
		if(getText().equals(dflt)){
			setText("Activé");
		}
		else setText(dflt);
	}
}
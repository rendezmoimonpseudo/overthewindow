import java.awt.Button;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class ColorButton extends Button implements MouseListener{
	
	String dflt;
	
	public ColorButton(String label){
	super(label);
	setBackground(Color.CYAN);
	this.addMouseListener(this);
	dflt = label;
	}
	
	public void mouseClicked(MouseEvent arg0) {
		setBackground(Color.YELLOW);
	}
	public void mouseEntered(MouseEvent arg0) {
		setBackground(Color.RED);
	}
	public void mouseExited(MouseEvent arg0) {
		setBackground(Color.CYAN);
		setLabel(dflt);
	}
	public void mousePressed(MouseEvent arg0) {
		setLabel("Pressé !");
	}
	public void mouseReleased(MouseEvent arg0) {
		setLabel("Relâché !");
	}
	
}

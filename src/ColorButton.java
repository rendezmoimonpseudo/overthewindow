import java.awt.Button;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class ColorButton extends Button implements MouseListener{
	public ColorButton(String label){
	super(label);
	setBackground(Color.CYAN);
	this.addMouseListener(this);
	}

	public void mouseClicked(MouseEvent arg0) {
		setBackground(Color.YELLOW);
	}
	public void mouseEntered(MouseEvent arg0) {
		setBackground(Color.RED);
	}
	public void mouseExited(MouseEvent arg0) {
		setBackground(Color.CYAN);
	}
	public void mousePressed(MouseEvent arg0) {
		System.out.println("Pressé !");
	}
	public void mouseReleased(MouseEvent arg0) {
		System.out.println("Relâché !");
	}
	
}

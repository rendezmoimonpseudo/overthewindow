import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class Panneau extends JPanel{
	
	
	private int i = 0;
	public void paintComponent(Graphics g){
		System.out.println("Execution numero : " + (i++));
	
	int ref = Math.min(getWidth(), getHeight())/2;
	g.setColor(Color.GREEN);
	g.fillPolygon(new int[] {getWidth()*0, getWidth()/4, getWidth()/2}, new int[] {ref, getHeight()*0, ref}, 3);
	
	g.setColor(Color.BLUE);
	g.fillRect(getWidth()/2, getHeight()*0 , ref, ref);
	
	g.setColor(Color.YELLOW);
	g.fillOval(getWidth()*0, getHeight()/2, ref, ref);
	
	try {
		Image img = ImageIO.read(new File("apple.jpg"));
		g.drawImage(img, getWidth()/2, getHeight()/2, ref, ref, this);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	
}

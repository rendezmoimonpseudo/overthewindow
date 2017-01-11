import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Calculatrice extends JFrame {
	
	public Calculatrice(){
		
		JPanel pan = new JPanel();
		JPanel pan2 = new JPanel();
		JPanel pan3 = new JPanel();
		JPanel pan4 = new JPanel();
		JLabel lab = new JLabel("Ecran");
		JButton but1 = new JButton("1");
		JButton but2 = new JButton("2");
		JButton but3 = new JButton("3");
		JButton but4 = new JButton("4");
		JButton but5 = new JButton("5");
		JButton but6 = new JButton("6");
		JButton but7 = new JButton("7");
		JButton but8 = new JButton("8");
		JButton but9 = new JButton("9");
		JButton but0 = new JButton("0");
		JButton point = new JButton(".");
		JButton equal = new JButton("=");
		JButton erase = new JButton("C");
		JButton addi = new JButton("+");
		JButton soust = new JButton("-");
		JButton multi = new JButton("*");
		JButton divi = new JButton("/");
		
		but1.setForeground(Color.RED);
		but2.setForeground(Color.RED);
		but3.setForeground(Color.RED);
		but4.setForeground(Color.RED);
		but5.setForeground(Color.RED);
	    but6.setForeground(Color.RED);
		but7.setForeground(Color.RED);
		but8.setForeground(Color.RED);
		but9.setForeground(Color.RED); 
		but0.setForeground(Color.RED);
		point.setForeground(Color.RED);	
		equal.setForeground(Color.RED);
		erase.setForeground(Color.BLACK);
		addi.setForeground(Color.BLACK);
		soust.setForeground(Color.BLACK);
		multi.setForeground(Color.BLACK);
		divi.setForeground(Color.BLACK);
		but1.setBackground(Color.BLACK);
		but2.setBackground(Color.BLACK);
		but3.setBackground(Color.BLACK);
		but4.setBackground(Color.BLACK);
		but5.setBackground(Color.BLACK);
		but6.setBackground(Color.BLACK);
		but7.setBackground(Color.BLACK);
		but8.setBackground(Color.BLACK);
		but9.setBackground(Color.BLACK);
		but0.setBackground(Color.BLACK);
		point.setBackground(Color.BLACK);
		equal.setBackground(Color.BLACK);
		erase.setBackground(Color.RED);
		addi.setBackground(Color.RED);
		soust.setBackground(Color.RED);
		multi.setBackground(Color.RED);
		divi.setBackground(Color.RED);
		
		this.setTitle("Compteratrice");
		this.setSize(500, 450);
		this.setLocationRelativeTo(null);
		
		pan2.setPreferredSize(new Dimension(this.getWidth()-(this.getWidth()/3), this.getHeight()-(this.getHeight()/5)));
		pan2.setLayout(new GridLayout(4, 3));
		pan2.add(but1);
		pan2.add(but2);
		pan2.add(but3);
		pan2.add(but4);
		pan2.add(but5);
		pan2.add(but6);
		pan2.add(but7);
		pan2.add(but8);
		pan2.add(but9);
		pan2.add(but0);
		pan2.add(point);
		pan2.add(equal);
		
		pan3.setPreferredSize(new Dimension(this.getWidth()/3, this.getHeight()-(this.getHeight()/5)));
		pan3.setLayout(new GridLayout(0, 1));
		pan3.add(erase);
		pan3.add(addi);
		pan3.add(soust);
		pan3.add(multi);
		pan3.add(divi);

		pan4.setPreferredSize(new Dimension(this.getWidth(), this.getHeight()/5));
		pan4.setBackground(Color.WHITE);
		pan4.setLayout(new BorderLayout());
		pan4.add(lab, BorderLayout.EAST);
		
		pan.setLayout(new BorderLayout());
		pan.add(pan4, BorderLayout.NORTH);
		pan.add(pan2, BorderLayout.CENTER);
		pan.add(pan3, BorderLayout.EAST);
		
		this.setContentPane(pan);
		this.setVisible(true);
		}
}

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
		
		for(int i = 9; i>=0; i--){
			JButton but = new JButton("" + i);
			but.setForeground(Color.WHITE);
			but.setBackground(Color.DARK_GRAY);
			pan2.add(but);
		}
		
		JButton point = new JButton(".");
		JButton equal = new JButton("=");
		JButton erase = new JButton("C");
		JButton addi = new JButton("+");
		JButton soust = new JButton("-");
		JButton multi = new JButton("*");
		JButton divi = new JButton("/");
		
		point.setForeground(Color.WHITE);	
		equal.setForeground(Color.WHITE);
		erase.setForeground(Color.WHITE);
		addi.setForeground(Color.WHITE);
		soust.setForeground(Color.WHITE);
		multi.setForeground(Color.WHITE);
		divi.setForeground(Color.WHITE);

		point.setBackground(Color.DARK_GRAY);
		equal.setBackground(Color.DARK_GRAY);
		erase.setBackground(Color.BLACK);
		addi.setBackground(Color.BLACK);
		soust.setBackground(Color.BLACK);
		multi.setBackground(Color.BLACK);
		divi.setBackground(Color.BLACK);
		
		this.setTitle("Compteratrice");
		this.setSize(500, 450);
		this.setLocationRelativeTo(null);
		
		pan2.setPreferredSize(new Dimension(this.getWidth()-(this.getWidth()/3), this.getHeight()-(this.getHeight()/5)));
		pan2.setLayout(new GridLayout(4, 3));

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
		pan4.setBackground(Color.GRAY);
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

		class CreationValeurs implements ActionListener{
			public void actionPerformed(ActionEvent e){
				
			}
		}

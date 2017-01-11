import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;

public class TesTPos extends JFrame {
	 public TesTPos(){
		 	
		 	JPanel pan = new JPanel();
		 	JPanel pan2 = new JPanel();
		 	JPanel pan3 = new JPanel();
		 	JLabel lab1 = new JLabel("1");
		 	JLabel lab2 = new JLabel("2");
		 	JLabel lab3 = new JLabel("3");
		 	JLabel lab4 = new JLabel("4");
		 	JLabel lab5 = new JLabel("5");
		 	JLabel lab6 = new JLabel("6");
		 	JLabel lab7 = new JLabel("7");
		 	JLabel lab8 = new JLabel("8");
		 	
//		 	JButton nord = new JButton("Nord");
//		 	JButton sud = new JButton("Sud"); 
//		 	JButton est = new JButton("Est"); 
//		 	JButton ouest = new JButton("Ouest"); 
//		 	JButton centre = new JButton("Centre"); 
		    this.setTitle("Bouton");
		    this.setSize(300, 300);
		    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		    this.setLocationRelativeTo(null);
		    
//		    pan.add(nord);
//		    pan.add(sud);
//		    pan.add(est);
//		    pan.add(ouest);
//		    pan.add(centre);
//		    
//		    // Tri BorderLayout
//		    pan.setLayout(new BorderLayout());
//		    //Au centre
//		    pan.add((centre), BorderLayout.CENTER);		    
//		    //Au nord
//		    pan.add((nord), BorderLayout.NORTH);		    
//		    //Au sud
//		    pan.add((sud), BorderLayout.SOUTH);	    
//		    //À l'ouest
//		    pan.add((ouest), BorderLayout.WEST);		    
//		    //À l'est
//		    pan.add((est), BorderLayout.EAST);
//		    
//		    // Tri GridLoayout
//		    pan.setLayout(new GridLayout(2, 3));
//		    
//		    // Tri BoxLayout
//		    pan.setLayout(new BoxLayout(pan, BoxLayout.PAGE_AXIS));
		    
		    pan2.add(lab1);
		    pan2.add(lab2);
		    pan2.add(lab3);
		    pan3.add(lab4);
		    pan3.add(lab5);
		    pan3.add(lab6);
		    pan3.add(lab7);
		    pan3.add(lab8);
		    
		    pan3.setLayout(new GridLayout(2, 3));
		    pan2.setLayout(new BoxLayout(pan2, BoxLayout.PAGE_AXIS));
		    pan.setLayout(new FlowLayout());
		    pan2.add(pan3);
		    pan.add(pan2);

		    
		    this.setContentPane(pan);
		    this.setVisible(true);
		  }      
}

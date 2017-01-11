import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.Border;


public class Fenetre extends JFrame {
	
	public Fenetre(){
//		JPanel pan = new JPanel();		
//		JButton but = new JButton("Mon bouton");
//		JLabel lab1 = new JLabel("Mon étiquette");
//		JCheckBox case1 = new JCheckBox("Case1", true);
//		JCheckBox case2 = new JCheckBox("Case2");
//		JTextField text1 = new JTextField();
//		JRadioButton rad1 = new JRadioButton("Oui", true);
//		JRadioButton rad2 = new JRadioButton("Non");
//		ButtonGroup bg = new ButtonGroup();
//		JLabel lab2 = new JLabel("Ma couleur");
//		JComboBox combo = new JComboBox();
		
//		text1.setPreferredSize(new Dimension(150, 20));
//		combo.setPreferredSize(new Dimension(100, 20));
//		combo.addItem("Bleu");
//		combo.addItem("Rouge");
//		combo.addItem("Vert");
//		combo.setSelectedItem("Rouge");
		
//		combo.addItemListener();
//		if(combo.equals("Rouge")){
//			pan.setBackground(Color.RED);
//		}
//		else if(combo.equals("Bleu")){
//			pan.setBackground(Color.BLUE);
//		}
//		else if (combo.equals("Vert")){
//			pan.setBackground(Color.GREEN);
//		}
		
		this.setTitle("Première fenêtre");
		this.setSize(500, 500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		this.setBackground(Color.BLACK);
		this.setLocationRelativeTo(null);
//		pan.setBackground(Color.BLUE);
		
		// ajouter un bouton
//		pan.setLayout(new FlowLayout());
//		pan.add(but);
//		getContentPane().setLayout(new FlowLayout()); // mettre 2 éléments à la suite
		
		// ajouter une étiquette (ou un label)
//		pan.add(lab1);
		
		// ajouter des cases à cocher
//		pan.add(case1);
//		pan.add(case2);
		
		// ajouter un champs pour saisir du texte
//		pan.add(text1);
		
		// ajouter des boutons radio
//		bg.add(rad1);
//		bg.add(rad2);
//		pan.add(rad1);
//		pan.add(rad2);
		
		// ajouter une liste déroulante
//		pan.add(lab2);
//		pan.add(combo);
		this.setContentPane(new Panneau());
//		this.getContentPane().setVisible(true);
		this.setVisible(true);
	}
}

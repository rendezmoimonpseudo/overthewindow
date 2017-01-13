import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JToolBar;
import javax.swing.WindowConstants;

public class test2 extends JFrame {
	
	private JPopupMenu pop = new JPopupMenu();
	private JRadioButtonMenuItem rouge = new JRadioButtonMenuItem("Rouge");
	private JRadioButtonMenuItem vert = new JRadioButtonMenuItem("Vert");
	private JMenuItem jaune = new JMenuItem("Jaune");
	private JMenuItem cyan = new JMenuItem("Cyan");
	private JButton butrouge = new JButton("Bouton Rouge");
	private JButton butvert = new JButton("Bouton Vert");
	int rep;
//	JMenuItem rouge = new JMenuItem("Rouge");
//	JMenuItem vert = new JMenuItem("Vert");
	
	public test2(){
		
		boolean bool = true;
		do{
			rep = JOptionPane.showConfirmDialog(this, "Prêt à voir la meilleure application du monde ?", "", JOptionPane.YES_NO_OPTION);
			if(rep == JOptionPane.NO_OPTION){
				int rep2 = JOptionPane.showConfirmDialog(this, "Êtes-vous sûr ?", "", JOptionPane.YES_NO_OPTION);
				if(rep2 == JOptionPane.YES_OPTION || rep2 == JOptionPane.CLOSED_OPTION){
					System.exit(0);
				}
				else if(rep2 == JOptionPane.NO_OPTION){
					bool = false;
				}
			}
			else if(rep == JOptionPane.CLOSED_OPTION)
				System.exit(0);
			else bool = true;
			
		}while(bool == false);
		
		setTitle("Azerty");
		JMenuBar menu = new JMenuBar();
		setJMenuBar(menu);
		JMenu couleur = new JMenu("Couleur");
		menu.add(couleur);
		pop.add(jaune);
		pop.add(cyan);
		couleur.add(rouge);
//		couleur.addSeparator();
		couleur.add(vert);
		ButtonGroup grp = new ButtonGroup();
		grp.add(rouge);
		grp.add(vert);
		rouge.setSelected(true);
		if(rouge.isSelected()) getContentPane().setBackground(Color.RED);
		JToolBar barreOut = new JToolBar();
		barreOut.add(butrouge);	
		barreOut.add(butvert);

		getContentPane().add(barreOut);
		getContentPane().setLayout(new BorderLayout());
		getContentPane().add(barreOut, BorderLayout.NORTH);
		barreOut.setFloatable(false);
		setSize(300, 200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		
		addMouseListener(new ActionSouris());
		
		rouge.addActionListener(new CouleurFond());
		vert.addActionListener(new CouleurFond());
		jaune.addActionListener(new CouleurFond());
		cyan.addActionListener(new CouleurFond());
		butrouge.addActionListener(new CouleurFond());
		butvert.addActionListener(new CouleurFond());
		
		setVisible(true);
	}
	public class CouleurFond implements ActionListener{
		
		@Override
		public void actionPerformed(ActionEvent e) {
			if((e.getSource() == rouge) || (e.getSource() == butrouge)){
				getContentPane().setBackground(Color.RED);
			}
			if((e.getSource() == vert) || (e.getSource() == butvert)){
				getContentPane().setBackground(Color.GREEN);
			}
			if((e.getSource() == jaune)){
				getContentPane().setBackground(Color.YELLOW);
			}
			if((e.getSource() == cyan)){
				getContentPane().setBackground(Color.CYAN);
			}
		}
	}
	public class ActionSouris implements MouseListener{
		@Override
		public void mouseClicked(MouseEvent e) {
			// 404 Not Found Yet
			
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// 404 Not Found Yet
			
		}

		@Override
		public void mouseExited(MouseEvent e) {
			// 404 Not Found Yet
			
		}

		@Override
		public void mousePressed(MouseEvent e) {
			// 404 Not Found Yet
			
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			if(e.getButton() == MouseEvent.BUTTON3){
				pop.show(getContentPane(), e.getX()-8, e.getY()-56);
			}
		}
	}
}
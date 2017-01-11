import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class FenetreClic extends JFrame implements ActionListener {
	
	private JButton btn;
	private JButton btn2;
	private JPanel pan = new JPanel();
	
	public FenetreClic(){
		super("blablabla");
		setSize(300, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		btn = new JButton("Bouton 1");
		btn2 = new JButton("Bouton 2");
		btn.addActionListener(this);
		btn2.addActionListener(this);
		
		pan.add(btn);
		pan.add(btn2);
		setContentPane(pan);
		setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == (btn))
			System.out.println("T'as cliqué sur le bouton 1");
		else if(e.getSource() == (btn2))
			System.out.println("T'as cliqué sur le bouton 2");
		
	}

}

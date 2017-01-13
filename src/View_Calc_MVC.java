import java.util.Observable;
import java.util.Observer;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class View_Calc_MVC extends JFrame implements Observer {
	
	private JPanel container = new JPanel();
	private JLabel ecran;
	private String[] paveNumerique = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "0", ".", "="};
	private String[] paveOperateurs = {"C", "+", "-", "*", "/"};
	private Controller_Calc_MVC controller;
	
	public View_Calc_MVC(Controller_Calc_MVC controller){
		super("Compteratrice");
		setSize(350, 350);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		init();
		setResizable(false);
		
		
	}
	
	public void init(){
		
	}
	
	@Override
	public void update(Observable o, Object arg) {
	// 404 Not Found Yet
	
	}
	
}

import javax.swing.JFrame;
import javax.swing.JPanel;

public class test extends JFrame {
	public test(){
		JPanel pan = new JPanel();
		ColorButton cb = new ColorButton("Have Fun !");
		MonBouton mb = new MonBouton("Désactivé");
		pan.add(cb);
		pan.add(mb);
		setTitle("Magic Button");
		setSize(300, 200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		setContentPane(pan);
		setVisible(true);
	}
}

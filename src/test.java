import javax.swing.JFrame;
import javax.swing.JPanel;

public class test extends JFrame {
	public test(){
		JPanel pan = new JPanel();
		ColorButton cb = new ColorButton("Have Fun !");
		pan.add(cb);
		setTitle("Magic Button");
		setSize(300, 200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		setContentPane(pan);
		setVisible(true);
	}
}

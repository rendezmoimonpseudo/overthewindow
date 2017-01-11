import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;

public class MaFenetre extends JFrame implements MouseListener {
	public MaFenetre(){
		super("Une fenetre pour les gouverner tous (les clics souris)");
		setSize(300, 200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
		//La fenêtre fait appel à son propre écouteur d'événements
		addMouseListener(this);
	}
	
	//L'argument e de type MouseEvent correspond à l'objet événement
	//généré dans la fenêtre lors d'un clic souris. On peut utiliser
	//les informations qui lui sont associées.
	public void mouseClicked(MouseEvent e) {
		int x = e.getX();
		int y = e.getY();
		//coordonnées du curseur de la souris au moment du clic
		System.out.println("Clic dans la fenêtre au point de coordonnées " + x + ", " + y);
	}
	public void mouseEntered(MouseEvent e) {}
	public void mouseExited(MouseEvent e) {}
	public void mousePressed(MouseEvent e) {}
	public void mouseReleased(MouseEvent e) {}

}

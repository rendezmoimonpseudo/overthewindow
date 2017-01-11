import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;

public class MaFenetre extends JFrame implements MouseListener {
	public MaFenetre(){
		super("Une fenetre pour les gouverner tous (les clics souris)");
		setSize(300, 200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
		//La fen�tre fait appel � son propre �couteur d'�v�nements
		addMouseListener(this);
	}
	
	//L'argument e de type MouseEvent correspond � l'objet �v�nement
	//g�n�r� dans la fen�tre lors d'un clic souris. On peut utiliser
	//les informations qui lui sont associ�es.
	public void mouseClicked(MouseEvent e) {
		int x = e.getX();
		int y = e.getY();
		//coordonn�es du curseur de la souris au moment du clic
		System.out.println("Clic dans la fen�tre au point de coordonn�es " + x + ", " + y);
	}
	public void mouseEntered(MouseEvent e) {}
	public void mouseExited(MouseEvent e) {}
	public void mousePressed(MouseEvent e) {}
	public void mouseReleased(MouseEvent e) {}

}

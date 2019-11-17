package app;
import java.awt.Graphics;
import javax.swing.JPanel;
import metier.Carre;
import metier.Cercle;
import metier.Ellipse;
import metier.Point;
import metier.Rectangle;

public class FigurePanel extends JPanel{
	Rectangle rectangle=new Rectangle(new Point(100, 100), 200, 100);
	Carre carre=new Carre(new Point(500,350), 150);
	Ellipse ellipse=new Ellipse(new Point(150, 300), 250, 150);
	Cercle cercle=new Cercle(new Point(400, 100), 140);
	
	@Override
	protected void paintComponent(Graphics g) {
		g.drawString("L'aire du cercle est: "+cercle.aire(), 10, 20);
		g.drawString("Rectangle:"+rectangle.toString(), 10,40);
		g.drawString("Ellipse:"+ellipse.toString(), 10,60);
		g.drawString("Egalité du cerlce et de l'ellipse: "+ellipse.equals(cercle), 10, 80);
		rectangle.dessiner(g);
		ellipse.dessiner(g);
		carre.dessiner(g);
		cercle.dessiner(g);
	}
}
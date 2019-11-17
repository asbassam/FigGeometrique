package metier;

import java.awt.Color;
import java.awt.Graphics;

public class Rectangle extends AbstractFigureGeometrique implements Cloneable{
	protected int longueur,largeur;

	public Rectangle(Point p, int longueur, int largeur) {
		super(p);
		this.longueur=longueur;this.largeur=largeur;
	}

	@Override
	public void dessiner(Graphics g) {
		g.setColor(Color.red);
		g.drawRect(ancrage.getX(), ancrage.getY(), longueur, largeur);
	}

	@Override
	public double aire() {
		return longueur*largeur;
	}

	@Override
	public double perimetre() {
		return 2*(longueur+largeur);
	}
	
	@Override
	public String toString() {
		return "Rectangle["+ancrage.toString()+","+longueur+","+largeur+"]";
	}
	
	@Override
	public boolean equals(Object o) {
		if(o instanceof Rectangle) {
			Rectangle r=(Rectangle)o;
			if(this.longueur==r.longueur && this.largeur==r.largeur) return true;
			return false;
		}
		return false;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

}

package metier;

import java.awt.Color;
import java.awt.Graphics;

public class Ellipse extends AbstractFigureGeometrique{
	protected int a,b;
	
	public Ellipse(Point p, int a, int b) {
		super(p);
		this.a=a;this.b=b;
	}

	@Override
	public void dessiner(Graphics g) {
		g.setColor(Color.blue);
		g.drawOval(ancrage.getX(), ancrage.getY(), a, b);
	}

	@Override
	public double aire() {
		return Math.PI*a*b;
	}

	@Override
	public double perimetre() {
		return Math.PI*Math.sqrt(2*(a*a+b*b));
	}
	
	@Override
	public String toString() {
		return "Ellipse["+ancrage.toString()+","+a+","+b+"]";
	}
	
	@Override
	public boolean equals(Object o) {
		if(o instanceof Ellipse) {
			Ellipse e=(Ellipse)o;
			if(this.a==e.a && this.b==e.b) return true;
			return false;
		}
		return false;
	}
}

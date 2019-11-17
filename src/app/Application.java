package app;

import metier.Carre;
import metier.Cercle;
import metier.Ellipse;
import metier.IFigureGeometrique;
import metier.Point;
import metier.Rectangle;

public class Application {

	public static void main(String[] args) {
		Rectangle rectangle=new Rectangle(new Point(50, 100), 200, 80);
		IFigureGeometrique carre=new Carre(new Point(50, 100), 200);
		IFigureGeometrique ellipse=new Ellipse(new Point(50, 100), 200, 100);
		IFigureGeometrique cercle=new Cercle(new Point(50, 100), 200);
		
		System.out.println(rectangle.toString());
		System.out.println(carre.toString());
		System.out.println(ellipse.toString());
		System.out.println(cercle.toString());
		
		Rectangle r=null;
		try {
			r=(Rectangle) rectangle.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(r.equals(rectangle));

	}

}

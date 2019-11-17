package metier;

public class Cercle extends Ellipse{

	public Cercle(Point p, int rayon) {
		super(p, rayon,rayon);
	}
	
	@Override
	public String toString() {
		return "Cercle["+ancrage.toString()+","+a+"]";
	}

}

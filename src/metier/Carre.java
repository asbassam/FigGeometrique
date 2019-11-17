package metier;

public class Carre extends Rectangle{

	public Carre(Point p, int cote) {
		super(p, cote, cote);
	}
	
	@Override
	public String toString() {
		return "Carre["+ancrage.toString()+","+longueur+"]";
	}

}

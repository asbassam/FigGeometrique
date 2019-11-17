package metier;

public abstract class AbstractFigureGeometrique implements IFigureGeometrique{
	protected Point ancrage;
	public AbstractFigureGeometrique(Point p) {
		ancrage=p;
	}
}

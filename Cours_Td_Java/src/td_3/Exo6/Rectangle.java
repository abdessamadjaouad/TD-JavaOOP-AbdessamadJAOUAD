package td_3.Exo6;

public class Rectangle extends Figure{
	private double lo,la;
	public Rectangle() {
		
	}
	public Rectangle(int lo,int la) {
		this.lo = lo;
		this.la = la;
	}
	public Rectangle(int lo,int la,String nom) {
		this(lo,la);
		setNom(nom);
	}
	@Override
	public double getPerimeter() {
		return 2*(lo+la);
	}

	@Override
	public double getAir() {
		return la*lo;
	}

	@Override
	public String toString() {
		return getNom()+"{Longueur: "+lo+" , Largeur: "+la+"}";
	}

	public double getLo() {
		return lo;
	}

	public void setLo(double lo) {
		this.lo = lo;
	}

	public double getLa() {
		return la;
	}

	public void setLa(double la) {
		this.la = la;
	}

}

package td_3.Exo8Part1;

public class Rectangle implements Figure{
	private double lo,la;
	private String nom;
	public Rectangle() {
		
	}
	public Rectangle(int lo,int la) {
		this.lo = lo;
		this.la = la;
	}
	public Rectangle(int lo,int la,String nom) {
		this(lo,la);
		this.nom = nom;
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
		return nom+"{Longueur: "+lo+" , Largeur: "+la+"}";
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
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}

}

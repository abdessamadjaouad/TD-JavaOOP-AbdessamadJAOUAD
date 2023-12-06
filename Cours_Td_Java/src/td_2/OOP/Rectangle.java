package td_2.OOP;

public class Rectangle {
	private double longueur;
	private double largeur;
	public Rectangle(){}
	public Rectangle(double lo,double la) {
		if(la>=0)
			this.largeur = la;
		if(lo>=0)
			this.longueur = lo;
	}
	public Rectangle(Rectangle r) {
		this(r.getLongueur(),r.getLargeur());
	}
	public double getLongueur() {
		return longueur;
	}
	public void setLongueur(double lo) {
		if(lo>=0)
			this.longueur = lo;
	}
	public double getLargeur() {
		return largeur;
	}
	public void setLargeur(double la) {
		if(la>=0)
			this.largeur = la;
	}
	public double perimetre() {
		return 2*(getLargeur()+getLongueur());
	}
	public double air() {
		return getLargeur()*getLongueur();
	}
	public boolean isCarre() {
		return getLargeur()==getLongueur();
		
	}
	
	public String toString() {
		return "Rectangle{"+
				"Longueur: "+getLongueur()+", Largeur: "+getLargeur()+
				", perimetre: "+perimetre()+", air: "+air()+
				", Carre? "+(isCarre() ? "Oui" : "Non")+"}";
	}
}

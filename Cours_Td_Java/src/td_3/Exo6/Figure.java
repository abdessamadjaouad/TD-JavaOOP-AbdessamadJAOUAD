package td_3.Exo6;

public abstract class Figure {

	private String nom;

	public abstract double getPerimeter();
	public abstract double getAir();
	
	abstract public String toString();
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
}

package td_3.Exo8Part1;

public class Disque implements Figure{
	private int centre;
	private double rayon;
	private String nom;
	public Disque() {
		
	}
	public Disque(int c) {
		this.centre = c;
	}
	public Disque(int centre,double rayon) {
		this(centre);
		this.rayon = rayon;
	}
	public Disque(int centre,double rayon,String nom) {
		this(centre,rayon);
		this.nom = nom;
	}
	@Override
	public double getPerimeter() {
		return 2*Math.PI*rayon;
	}

	@Override
	public double getAir() {
		
		return Math.PI*rayon*rayon;
	}

	@Override
	public String toString() {
		return getNom()+"{centre: "+centre+" , rayon: "+rayon+"}";
	}

	public int getCentre() {
		return centre;
	}

	public void setCentre(int centre) {
		this.centre = centre;
	}

	public double getRayon() {
		return rayon;
	}

	public void setRayon(double rayon) {
		this.rayon = rayon;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}

}

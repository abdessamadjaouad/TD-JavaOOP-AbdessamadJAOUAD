package td_3.Exo6;

public class Disque extends Figure{
	private int centre;
	private double rayon;
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
		setNom(nom);
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

}

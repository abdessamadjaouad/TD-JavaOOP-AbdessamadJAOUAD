package td_3.OOP;

public class Immeuble extends Batiment{
	
	private int nbAppart;
	public Immeuble() {
		
	}
	public Immeuble(String a,int nbA) {
		this.setAdresse(a);
		this.setNbAppart(nbA);
	}
	public int getNbAppart() {
		return nbAppart;
	}
	public void setNbAppart(int nbAppart) {
		this.nbAppart = nbAppart;
	}
	@Override
	public String toString() {
		return "Immeuble: "+"adresse: "+getAdresse()+"\n	nombre d'appartements: "+nbAppart;
	}
}

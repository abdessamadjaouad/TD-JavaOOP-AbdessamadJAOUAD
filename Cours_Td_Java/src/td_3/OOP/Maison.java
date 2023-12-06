package td_3.OOP;

public class Maison extends Batiment {

	private int nbChambre;
	public Maison() {
	}
	public Maison(String a,int nbC) {
		this.setAdresse(a);
		this.setNbChambre(nbC);
	}
	public int getNbChambre() {
		return nbChambre;
	}
	public void setNbChambre(int nbChambre) {
		this.nbChambre = nbChambre;
	}
	@Override
	public String toString() {
		return "Maison: "+"adresse: "+getAdresse()+"\n	nombre de chambres: "+nbChambre;
	}
}

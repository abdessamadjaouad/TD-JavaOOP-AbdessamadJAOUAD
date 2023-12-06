package td_3.Exo5;

public class Avion extends Vehicule{

	private int nbMoteur;
	public Avion(int nbP) {
		super(nbP);
	}
	public Avion(int nbP,int nbM) {
		super(nbP);
		this.nbMoteur = nbM;
	}
	public int getNbMoteur() {
		return nbMoteur;
	}

	public void setNbMoteur(int nbMoteur) {
		this.nbMoteur = nbMoteur;
	}
	@Override
	public String toString() {
		return "Avion: "+"nbre de passagers= "+getNbPassagers()+
				" , nbre de Moteur= "+nbMoteur;
	}
}

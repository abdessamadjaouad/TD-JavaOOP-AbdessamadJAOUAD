package td_3.Exo5;

public class Vehicule {

	private int nbPassagers;
	public Vehicule() {
		
	}
	public Vehicule(int n) {
		this.setNbPassagers(n);
	}
	public int getNbPassagers() {
		return nbPassagers;
	}
	public void setNbPassagers(int nbPassagers) {
		this.nbPassagers = nbPassagers;
	}
	@Override
	public String toString() {
		return "Vehicule: "+"nbre de passagers= "+nbPassagers;
	}
}

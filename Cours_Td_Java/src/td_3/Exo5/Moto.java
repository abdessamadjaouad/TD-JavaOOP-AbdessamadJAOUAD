package td_3.Exo5;

public class Moto extends Vehicule{
	private int nbRoues = 2;
	
	public Moto (int n,int nbR) {
		super(n);
		this.nbRoues = nbR;
	}
	public Moto(int n){
		super(n);
	}
	public int getNbRoues() {
		return nbRoues;
	}
	@Override
	public String toString() {
		return "Moto: "+"nbre de passagers= "+getNbPassagers()+
				" , nbre de roues= "+nbRoues;
	}
}

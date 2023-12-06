package td_3.Exo5;

public class Triporteur extends Moto{
	
	public Triporteur(int n) {
		super(n, 3);
	}
	@Override
	public String toString() {
		return "Triporteur: "+"nbre de passagers= "+getNbPassagers()+
				" , nbre de roues= "+getNbRoues();
	}
}

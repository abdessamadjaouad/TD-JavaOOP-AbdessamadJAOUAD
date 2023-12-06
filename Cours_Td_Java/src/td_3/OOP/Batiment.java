package td_3.OOP;

public class Batiment {

	private String adresse;
	public Batiment() {
		
	}
	public Batiment(String a) {
		this.setAdresse(a);
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	@Override
	public String toString() {
		return "Batiment: "+"adresse: "+adresse;
	}
}

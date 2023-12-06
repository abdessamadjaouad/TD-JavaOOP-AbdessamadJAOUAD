package td_3.Exo8Part2;

public class TravailleurHoraire implements Employee{
	private double retribution;
	private int heures;
	private String nom;
	private String prenom;
	public TravailleurHoraire() {
		
	}
	public TravailleurHoraire(String nom,String prenom,double ret) {
		this.nom = nom;
		this.prenom = prenom;
		this.setRetribution(ret);
	}
	@Override
	public double gains() {
		
		return retribution*heures;
	}
	@Override
	public String toString() {
		return "Patron{Nom: "+getNom()+" "+getPrenom()+
				", Retribution: "+getRetribution()+
				", Heures: "+getHeures()+", Salaire: "+retribution*heures+"}";
	}
	public double getRetribution() {
		return retribution;
	}
	public void setRetribution(double retribution) {
		this.retribution = retribution;
	}
	public int getHeures() {
		return heures;
	}
	public void setHeures(int heures) {
		this.heures = heures;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
}

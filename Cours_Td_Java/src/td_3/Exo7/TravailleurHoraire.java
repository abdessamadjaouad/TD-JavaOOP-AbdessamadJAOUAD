package td_3.Exo7;

public class TravailleurHoraire extends Employee{
	private double retribution;
	private int heures;
	public TravailleurHoraire() {
		
	}
	public TravailleurHoraire(String nom,String prenom,double ret) {
		setNom(nom);
		setPrenom(prenom);
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
}

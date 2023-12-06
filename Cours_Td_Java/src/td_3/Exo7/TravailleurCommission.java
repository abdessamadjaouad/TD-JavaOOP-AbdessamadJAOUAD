package td_3.Exo7;

public class TravailleurCommission extends Employee{
	private double  salaire;
	private double commission;
	private int quantite;
	public TravailleurCommission() {
		
	}
	public TravailleurCommission(String nom,String prenom,double s,double com) {
		setNom(nom);
		setPrenom(prenom);
		this.salaire = s;
		this.commission = com;
	}
	@Override
	public double gains() {
		return this.salaire;
	}
	@Override
	public String toString() {
	return "TravailleurCommission{Nom: "+getNom()+" "+getPrenom()+
				", Salaire: "+getSalaire()+", Commission: "+getCommission()+"}";
	}
	public double getSalaire() {
		return salaire;
	}
	public void setSalaire(double salaire) {
		this.salaire = salaire;
	}
	public double getCommission() {
		return commission;
	}
	public void setCommission(double commission) {
		this.commission = commission;
	}
	public int getQuantite() {
		return quantite;
	}
	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}
}

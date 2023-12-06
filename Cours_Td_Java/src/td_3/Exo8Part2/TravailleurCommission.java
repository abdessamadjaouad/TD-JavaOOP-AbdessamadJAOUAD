package td_3.Exo8Part2;

public class TravailleurCommission implements Employee{
	private double  salaire;
	private double commission;
	private int quantite;
	private String nom;
	private String prenom;
	public TravailleurCommission() {
		
	}
	public TravailleurCommission(String nom,String prenom,double s,double com) {
		this.nom = nom;
		this.prenom = prenom;
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

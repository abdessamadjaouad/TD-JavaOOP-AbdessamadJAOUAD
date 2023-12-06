package td_3.Exo8Part2;

public class Patron implements Employee{
	private double salaire;
	private String nom;
	private String prenom;
	public Patron() {
		
	}
	public Patron(String nom,String prenom,double s) {
		this.nom = nom;
		this.prenom = prenom;
		this.setSalaire(s);
	}
	
	@Override
	public double gains() {
		return salaire;
	}
	public double getSalaire() {
		return salaire;
	}
	public void setSalaire(double salaire) {
		this.salaire = salaire;
	}
	@Override
	public String toString() {
		return "Patron{Nom: "+getNom()+" "+getPrenom()+
				", Salaire: "+getSalaire()+"}";
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
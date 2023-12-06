package td_3.Exo7;

public class Patron extends Employee{
	private double salaire;
	
	public Patron() {
		
	}
	public Patron(String nom,String prenom,double s) {
		setNom(nom);
		setPrenom(prenom);
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
}
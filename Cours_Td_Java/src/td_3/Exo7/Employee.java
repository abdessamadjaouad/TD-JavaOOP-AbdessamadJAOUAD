package td_3.Exo7;

public abstract class Employee {
	private String nom;
	private String prenom;
	public Employee() {
		
	}
	public Employee(String nom,String prenom) {
		this.setNom(nom);
		this.setPrenom(prenom);
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
	
	@Override
	public String toString() {
		return getNom()+" "+getPrenom();
	}
	 public abstract double gains();
}
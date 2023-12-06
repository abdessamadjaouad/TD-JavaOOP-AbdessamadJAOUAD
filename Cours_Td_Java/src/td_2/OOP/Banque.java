package td_2.OOP;

public class Banque {

	private int nCompte;
	private double solde;
	private String cin;
	
	public Banque( int nCompte,double solde,String cin) {
		this.nCompte = nCompte;
		this.cin = cin;
		this.solde = solde;
	}
	public void deposer(double s) {
		solde += s;
	}
	public void retirer(double s) {
		solde -= s;
	}
	public double avoirSolde() {
		return solde;
	}
	public String avoirInf() {
		return "Compte info{"+"NCompte: "+nCompte+
				", Solde: "+solde+", CIN: "+cin+"}";
	}
	public double getSolde() {
		return solde;
	}
}

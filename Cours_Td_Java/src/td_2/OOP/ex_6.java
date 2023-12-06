package td_2.OOP;

public class ex_6 {

	public static void main(String[] args) {
		
		Banque banque = new Banque(1,5000.75,"AB1200");
		System.out.println(banque.avoirInf());
		System.out.println("Solde:"+banque.getSolde());
		banque.deposer(500);
		System.out.println(banque.avoirInf());
		System.out.println("Solde:"+banque.getSolde());
		banque.retirer(200);
		System.out.println(banque.avoirInf());
		System.out.println("Solde:"+banque.getSolde());

	}

}

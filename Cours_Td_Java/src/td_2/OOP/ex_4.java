package td_2.OOP;

public class ex_4 {

	public static void main(String[] args) {

		Temps t1 = new Temps();
		Temps t2 = new Temps(9);
		Temps t3 = new Temps(10,0);
		Temps t4 = new Temps(9,6,2);
		Temps t5 = new Temps(t4);
		
		
		t1.ajouterSecondes(65);
		t3.setSecondes(5);
		t4.ajouterMinutes(3);
		t5.ajouterHeures(5);
		
		System.out.println(t1);
		System.out.println(t2);
		System.out.println(t3);
		System.out.println(t4);
		System.out.println(t5);
		
	}

}

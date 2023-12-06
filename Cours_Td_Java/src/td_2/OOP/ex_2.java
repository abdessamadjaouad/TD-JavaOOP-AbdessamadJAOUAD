package td_2.OOP;

public class ex_2 {

	public static void main(String[] args) {

		Point2 o = new Point2('O',5,8);
		o.affiche();
		System.out.println("La norme de "+o.getName()+" est: "+o.norme());
		
		o.setOrd(7);
		o.setAbs(10);
		o.affiche();
		System.out.println("La nouvelle norme de "+o.getName()+" est: "+o.norme());
		
		o.setName('o');
		System.out.println("Le nouveau nom du point est: "+o.getName());
		
	}

}

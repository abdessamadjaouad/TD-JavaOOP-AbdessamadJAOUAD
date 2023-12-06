package td_3.Exo5;

public class ex_5 {
    public static void main(String[] args) {

    	Vehicule v = new Vehicule();
    	Moto m = new Moto(2);
    	Avion a = new Avion(200,4);
    	Triporteur t = new Triporteur(10);
    	v.setNbPassagers(10);
    	m.setNbPassagers(5);
    	System.out.println(v);
    	System.out.println(m);
    	System.out.println(a);
    	System.out.println(t);
    	a.setNbMoteur(2);
    	System.out.println(a);    	
    }
}


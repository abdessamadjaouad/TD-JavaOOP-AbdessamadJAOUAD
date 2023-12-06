package td_3.Exo6;

public class testFigure {

	public static void main(String[] args) {
		Disque d = new Disque();
		Rectangle r = new Rectangle();
		d.setCentre(1);
		d.setRayon(5);
		d.setNom("Disque");
		System.out.println("Le perimetre: "+d.getPerimeter());
		System.out.println("L'air: "+d.getAir());
		System.out.println(d);
		r.setLa(5);
		r.setLo(10);
		r.setNom("Rectangle");
		System.out.println("Le perimetre: "+r.getPerimeter());
		System.out.println("L'air: "+r.getAir());
		System.out.println(r);
	}

}

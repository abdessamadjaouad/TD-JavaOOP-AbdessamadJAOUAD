package td_3.OOP;

public class testBatiment {

	public static void main(String[] args) {
		Batiment b = new Batiment();
		Maison m = new Maison();
		Immeuble i = new Immeuble();
		
		b.setAdresse("99 BIS rue ouad eddahab Qu. Saada Safi");
		m.setNbChambre(5);
		m.setAdresse("99 BIS rue ouad eddahab Qu. Saada Safi");
		i.setNbAppart(3);
		i.setAdresse("99 BIS rue ouad eddahab Qu. Saada Safi");
		System.out.println(b);
		System.out.println(m);
		System.out.println(i);
		 
	}

}

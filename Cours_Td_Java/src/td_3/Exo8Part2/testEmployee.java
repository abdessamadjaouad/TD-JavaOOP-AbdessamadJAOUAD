package td_3.Exo8Part2;

public class testEmployee {

	public static void main(String[] args) {
		Patron p = new Patron("lhaj","lgahma",1000000);
		TravailleurCommission tc  = new TravailleurCommission("taleb","m3acho",3000,20);
		TravailleurHoraire th = new TravailleurHoraire("independent","mra",10);
		
		System.out.println(p);
		System.out.println("Gains: "+p.gains());
		System.out.println(tc);
		System.out.println("Gains: "+tc.gains());
		th.setHeures(200);
		System.out.println(th);
		System.out.println("Gains: "+th.gains());
		
	}

}

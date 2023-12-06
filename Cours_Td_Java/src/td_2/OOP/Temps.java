package td_2.OOP;

public class Temps {

	private int heures;
	private int minutes;
	private int secondes;
	
	public Temps() {
	}
	public Temps(int heures) {
		this.heures = heures;
		
	}
	public Temps(int heures, int minutes) {
		this(heures);
		this.minutes = minutes;
	}
	public Temps(int heures, int minutes, int secondes) {
		this(heures,minutes);
		this.secondes = secondes;
	}
	public Temps(Temps t) {
		this(t.getHeures(),t.getMinutes(),t.getSecondes());
	}
	public int getHeures() {
		return heures;
	}
	public void setHeures(int heures) {
		this.heures = heures;
	}
	public int getMinutes() {
		return minutes;
	}
	public void setMinutes(int minutes) {
		this.minutes = minutes;
	}
	public int getSecondes() {
		return secondes;
	}
	public void setSecondes(int secondes) {
		this.secondes = secondes;
	}
	public void ajouterHeures(int heure) {
		this.setHeures(this.getHeures() + heure);
		if(heures >23)
			heures = 0;
	}
	public void ajouterMinutes(int minute) {
		minute += this.getMinutes();
		ajouterHeures(minute/60);
		setMinutes(minute%60);
	}
	public void ajouterSecondes(int seconde) {
		seconde += this.getSecondes();
		ajouterMinutes(seconde/60);
		setSecondes(seconde%60);
	}
	
	@Override
	public String toString() {
		return getHeures()+":"+getMinutes()+":"+getSecondes();
	}
}

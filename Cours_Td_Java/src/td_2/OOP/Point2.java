package td_2.OOP;

public class Point2 {

	private char name;
	private double abs;
	private double ord;
	public Point2(char name, double abs,double ord){
		this.name = name;
		this.abs = abs;
		this.ord = ord;
	}
	public void affiche() {
		System.out.println(name+": "+abs+" , "+ord);
	}
	public double norme(){
		return Math.sqrt((abs*abs)+(ord*ord));
	}
	public char getName() {
		return name;
	}
	public double getAbs() {
		return abs;
	}
	public double getOrd() {
		return ord;
	}
	public void setName(char name) {
		this.name = name;
	}
	public void setAbs(double abs) {
		this.abs = abs;
	}
	public void setOrd(double ord) {
		this.ord = ord;
	}
}

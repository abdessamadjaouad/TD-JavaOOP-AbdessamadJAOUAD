package td_2.OOP;

public class Point1 {

	private char name;
	private double abs;
	public Point1(char name, double abs){
		this.name = name;
		this.abs = abs;
	}
	public void affiche() {
		System.out.println(name+": "+abs);
	}
	public void translate(double translation) {
		abs += translation;
	}
	public char getName() {
		return name;
	}
	public double getAbs() {
		return abs;
	}
	public void setName(char name) {
		this.name = name;
	}
	public void setAbs(double abs) {
		this.abs = abs;
	}
}

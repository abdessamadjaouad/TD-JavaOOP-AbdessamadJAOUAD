package td_3.OOP;

public class ex_2 {

	public static void main(String[] args) {
		
		Point2 a = new Point2();
		PointNom b = new PointNom();
		
		a.setX(1);
		a.setY(1);
		a.affCoord();
		a.deplace(2,1);
		a.affCoord();
		
		b.setPointNom(5,3,'O');
		b.affCoordNom();
		b.deplace(1, 1);
		b.affCoordNom();
	}

}
class Point2 {
	 public void Point2(int x, int y) {
	 this.x = x;
	 this.y = y;
	 }
	 public void deplace(int dx, int dy) {
	 x += dx;
	 y += dy;
	 }
	 public void affCoord() {
	 System.out.println("Coordonnees : (" + x + "," + y+")");
	 }
	 private int x, y;
	 
	 public int getX() {
		 return x;
	 }
	 public void setX(int x) {
		 this.x = x;
	 }
	 public int getY() {
		 return y;
	 }
	 public void setY(int y) {
		 this.y = y;
	 }
	 
	}
class PointNom extends Point2{
	private char nom;
	public void setPointNom(int x,int y, char nom) {
		this.nom = nom;
		setX(x);
		setY(y);
	}
	public char getNom() {
		return nom;
	}
	public void setNom(char nom) {
		this.nom = nom;
	}
	public void affCoordNom() {
		 System.out.println("Coordonnees de " + nom+ ": ("+getX()+","+getY()+")");
	}
}
package td_3.OOP;

public class ex_3 {

	public static void main(String[] args) {
		Centre o = new Centre();
		Cercle c = new Cercle();
		
		o.setNom('O');
		o.setX(1);
		o.setY(1);
		o.affiche();
		c.setNom('C');
		c.setX(0);
		c.setY(0);
		c.setR(5);
		c.affiche();
	}

}
class Point3 {
	 public Point3() {
	
	 }
	 public Point3(int x, int y) {
		 this.x = x;
		 this.y = y;
		 }
	 public void affCoord() {
	 System.out.println("Coordonnees : " + x + " " + y);
	 }
	 public void affiche() {
	 System.out.println("Coordonnees : " + x + " " + y);
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
class Centre extends Point3{
	private char nom;
	public Centre(){
		
	}
	public Centre(int x,int y, char nom) {
		this.nom = nom;
		this.setX(x);
		this.setY(y);
	}
	public char getNom() {
		return nom;
	}
	public void setNom(char nom) {
		this.nom = nom;
	}
	public void affNom() {
		System.out.println(nom);
	}
	public void affiche() {
		 System.out.println("Coordonnees de " + nom+ ": ("+getX()+","+getY()+")");
	}
}
class Cercle extends Centre{
	private int r;
	public Cercle() {
		
	}
	public Cercle(int x, int y,int r) {
		this.setR(r);
		this.setX(x);
		this.setY(y);
	}
	public int getR() {
		return r;
	}
	public void setR(int r) {
		this.r = r;
	}
	public void affiche() {
		 System.out.println("Coordonnees : " + getNom()+ "[("+getX()+","+getY()+"),"+r+"]");
	}
}

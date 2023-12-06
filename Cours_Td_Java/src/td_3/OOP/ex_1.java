package td_3.OOP;

public class ex_1 {

	public static void main(String[] args) {
		Point o = new Point();
		System.out.println(o.getX()+"   "+o.getY());
		PointA a = new PointA();
		a.affiche();
// 2- si on n'a pas getX() et getY(), on ne peut pas avoir l'accees au variables privees x et y.
		
	}

}
class Point {
	 public void Point(int x, int y) {
	 this.x = x;
	 this.y = y;
	 }
	 public void deplace(int dx, int dy) {
	 x += dx;
	 y += dy;
	 }
	 public int getX() {
		
		 return x;
	 }
	 public int getY() {
	 return y;
	 }
	 private int x, y;
	}
class PointA extends Point{
	public void affiche() {
		System.out.println("Les coordonnees du point sont: ("+getX()+","+getY()+")");
	}
}
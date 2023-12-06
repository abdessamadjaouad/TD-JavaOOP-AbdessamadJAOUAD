package td_2.OOP;

public class ex_5 {
	public static void main(String[] args) {
	
		Rectangle rectangle1 = new Rectangle();
		Rectangle rectangle2 = new Rectangle(10,12);
		Rectangle rectangle3 = new Rectangle(rectangle2);
        
		System.out.println(rectangle1);
		System.out.println(rectangle2);
		System.out.println(rectangle3);
		
	}
}

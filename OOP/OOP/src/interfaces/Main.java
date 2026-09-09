package interfaces;

public class Main {

	public static void main(String[] args) {
		Drawable d1 = new Circle(10.0);
		Drawable d2 = new Rectangle(5.0, 8.0);
		
		d1.draw();
		d1.resize(1.5);
		
		System.out.println();
		
		d2.draw();
		d2.resize(0.8);
	}

}

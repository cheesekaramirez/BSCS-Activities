package abstract_lesson;

public class Main {

	public static void main(String[] args) {
		Shape shape1 = new Circle("Red",5.0);
		Shape shape2 = new Rectangle("Blue",4.0,6.0);
		
		System.out.println("=== Circle ===");
		shape1.displayInfo();
		System.out.println("\n=== Rectangle ===");
		shape2.displayInfo();

	}

}

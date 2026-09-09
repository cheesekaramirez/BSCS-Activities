package interfaces;

public class Circle implements Drawable {
	private double radius;
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	@Override
	public void draw() {
		System.out.println("Drawing a circle with radius: "+ radius);
	}
	
	@Override
	public void resize(double scale) {
		radius *= scale;
		System.out.println("Resized circle to radius: "+ radius);
	}
}

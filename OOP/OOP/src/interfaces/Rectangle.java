package interfaces;

public class Rectangle implements Drawable {
	private double width, height;
	
	public Rectangle(double width,double height) {
		this.width = width;
		this.height = height;
	}
	
	@Override
	public void draw() {
		System.out.println("Drawing rectangle : "+ width+" x "+height);
	}
	
	@Override
	public void resize(double scale) {
		width *= scale;
		height *= scale;
		System.out.println("Resized to: "+width+" x "+height);
	}
}

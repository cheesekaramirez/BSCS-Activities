package abstract_lesson;

public abstract class Shape {
	
	protected String color;
	protected double area;
	
	public Shape(String color) {
		this.color = color;
	}
	
	public abstract double calculateArea();
	
	public void displayInfo() {
		System.out.println("Color: "+ color);
		System.out.println("Area: "+ calculateArea());
	}
	
	public String getColor() {
		return color;
	}

}

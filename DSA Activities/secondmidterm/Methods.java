package secondmidterm;
import java.util.Scanner;

public class Methods {

	public static void main(String[] args) {
		double length,width;
		double area;
		Scanner scn= new Scanner(System.in);
		
		System.out.print("Enter length: ");
		length=scn.nextDouble();
		System.out.print("Enter width: ");
		width=scn.nextDouble();
		area=calculateArea(length,width);
		System.out.print("The area of the rectangle is "+area+".");
	}
	
	public static double calculateArea(double l, double w) 
	{
		return l*w;
	}

}

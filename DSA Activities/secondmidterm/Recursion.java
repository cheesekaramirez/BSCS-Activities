package secondmidterm;
import java.util.Scanner;

public class Recursion {

	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.print("Enter number: ");
		int n=scn.nextInt();
		int result=factorial(n);
		System.out.printf("The factorial of %d is equal to %d.",n,result);
		scn.close();
		
	}
	
	public static int factorial(int n) 
	{
		int result;
		if(n==1) 
		{
			return n;
		}
		result= n*factorial(n-1);
		return result;
		
	}

}

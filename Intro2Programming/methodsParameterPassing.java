package chescaWorkspace;
import java.util.Scanner;

public class methodsParameterPassing 
{
	static void thisLoop()
	{
		int counter = 5;
		for(int repeats=5;counter<=repeats&&counter !=0;counter--) 
		{
			System.out.println("Code successfully executed!");
		}
	}
	
	static void thisNestedLoopStars() {
		char c='*';
		int counter = 0;
		int j=1;
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter symbol:"+" ");
		c = scn.next().charAt(0);
		System.out.print("Enter number:"+" ");
		counter = scn.nextInt();
		
		for(int i=1;i<=counter;i++) 
		{
				for(j=1;j<=i;j++) 
				{
					System.out.print(c);
				}
		}
		
	}
	
	public static void main(String[] args) 
	{
		thisLoop();
		thisNestedLoopStars();
	}
}
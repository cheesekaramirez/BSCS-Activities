package chescaWorkspace;
import java.util.Scanner;

public class FamilyRegistry {
	

	public static void main(String[] args) {
		
		while(true) {
		String fname;
		char mname;
		
		Scanner input=new Scanner(System.in);
		System.out.print("Enter First Name: "+"\t");
		fname=input.nextLine();
		System.out.print("Enter Mother's Name: "+"\t");
		mname=input.nextLine().charAt(0);
		System.out.print("LOADING [");
		try { //try-catch makes the code run with a fallback code in case of errors
			for(int s=0;s<=30;s++) 
			{
				Thread.sleep(50);
				System.out.print("=");
			}
			System.out.println("] REGISTERED!");
        } catch (InterruptedException e) {
            System.out.println("Interrupted");
        }
		System.out.println();
		System.out.println(nameContainer(fname,mname));
	}
	}
	
	public static String nameContainer (String fname, char mname) 
	{
		return "Your name is "+fname+" "+mname+".  "+"Ramirez.";
	}

}

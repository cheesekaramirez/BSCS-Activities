package student;
import java.util.Scanner;

public class Studentinfo 
{
	
	String name,address,fathersName,mothersName;
	char gender;
	int age;
	String contNumber;
	
	public Studentinfo() 
	{
		Scanner scn=new Scanner(System.in);
		System.out.print("Enter Student Name: ");
		name=scn.nextLine();
		System.out.print("Enter Student Age: ");
		age=scn.nextInt();
		scn.nextLine();
		System.out.print("Enter Student Gender: ");
		gender=scn.nextLine().charAt(0);
		System.out.print("Enter Address: ");
		address=scn.nextLine();
		System.out.print("Enter Contact Number: ");
		contNumber=scn.nextLine();
		System.out.print("Enter Father's Name: ");
		fathersName=scn.nextLine();
		System.out.print("Enter Mother's Name: ");
		mothersName=scn.nextLine();
	}
	
	public void display_student() 
	{
		System.out.println("STUDENT DETAILS");
		System.out.printf("Student Name: %s \n",this.name);
		System.out.printf("Age: %d \n",this.age);
		System.out.printf("Student Gender: %c \n",this.gender);
		System.out.printf("Student Address: %s \n",this.address);
		System.out.printf("Contact Number: %s \n",this.contNumber);
		System.out.printf("Father's name: %s \n",this.fathersName);
		System.out.printf("Mother's name: %s \n",this.mothersName);
		
	}

}

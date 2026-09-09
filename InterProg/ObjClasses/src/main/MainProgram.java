package main;
import employee.*;
import student.*;
import java.util.Scanner;

public class MainProgram {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		Studentinfo si1= new Studentinfo();
		System.out.println();
		Employeeinfo ei1 = new Employeeinfo();
		System.out.print("Enter Employee Name: ");
		ei1.name=scn.nextLine();
		System.out.print("Enter Employee Designation: ");
		ei1.designation=scn.nextLine();
		System.out.print("Enter Employee Academic Position: ");
		ei1.academicPosition=scn.nextLine();
		System.out.println();
		Acadinfo ai1= new Acadinfo();
		
		System.out.println();
		
		Studentinfo si2= new Studentinfo();
		System.out.println();
		Employeeinfo ei2 = new Employeeinfo();
		System.out.print("Enter Employee Name: ");
		ei2.name=scn.nextLine();
		System.out.print("Enter Employee Designation: ");
		ei2.designation=scn.nextLine();
		System.out.print("Enter Employee Academic Position: ");
		ei2.academicPosition=scn.nextLine();
		System.out.println();
		Acadinfo ai2= new Acadinfo();
		
		System.out.println();
		si1.display_student();
		System.out.println();
		ei1.displayEmployee();
		System.out.println();
		ai1.displayEducDetails();
		System.out.println();
		System.out.println();
		System.out.println("NEXT STUDENT");
		System.out.println();
		si2.display_student();
		System.out.println();
		ei2.displayEmployee();
		System.out.println();
		ai2.displayEducDetails();
		scn.close();
		
		
	}

}

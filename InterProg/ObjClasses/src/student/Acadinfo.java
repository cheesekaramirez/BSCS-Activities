package student;
import java.util.Scanner;

public class Acadinfo {
	
	public int studentNum;
	public double quiz1,quiz2,midterm_grade,final_grade;
	public double avgGrade;
	public int attendance;
	
	public Acadinfo() 
	{
		Scanner scn=new Scanner(System.in);
		System.out.print("Enter Student Number: ");
		studentNum=scn.nextInt();
		System.out.print("Enter Quiz 1 Grade: ");
		quiz1=scn.nextDouble();
		System.out.print("Enter Quiz 2 Grade: ");
		quiz2=scn.nextDouble();
		System.out.print("Enter Midterm Grade: ");
		midterm_grade=scn.nextDouble();
		System.out.print("Enter Final Grade: ");
		final_grade=scn.nextDouble();
		System.out.print("Enter Attendance Percentage: ");
		attendance=scn.nextInt();
		avgGrade=(quiz1+quiz2+midterm_grade+final_grade)/4.0;
	}
	
	public void displayEducDetails() 
	{
		System.out.println("STUDENT EDUCATIONAL DETAILS");
		System.out.printf("Student Number: %s %n",this.studentNum);
		System.out.printf("Student Grade Average: %.2f  %n",this.avgGrade);
		System.out.print("Student Attendance: "+this.attendance+"%");
	}
}

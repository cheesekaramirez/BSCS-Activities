package chescaWorkspace;
import java.util.*;
import java.text.*;

public class Salary {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("$#,###.00");
		
		int numEmp = 0;
		String[] name;
		double[] rate;
		double[] hoursWorked;
		
		System.out.print("Enter number of employees to process:");
		numEmp = scn.nextInt();
		
		name= new String[numEmp];
		rate = new double[numEmp];
		hoursWorked = new double[numEmp];
		
		
		
		for(int indexNum = 0;indexNum < numEmp;indexNum++) {
			System.out.print("\nEnter Employee name:");
			name[indexNum] = scn.next();
			
			System.out.print("Enter number of hours worked: ");
			hoursWorked[indexNum] = scn.nextDouble();
			
			System.out.print("Enter rate per hour: ");
			rate[indexNum] = scn.nextDouble();
			
			}
		}

	
}

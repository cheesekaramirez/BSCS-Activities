package employee;

public class Employeeinfo {
	public String name;
	public String designation;
	public String academicPosition;
	
	public void displayEmployee() 
	{
		System.out.println("EMPLOYEE'S DETAILS");
		System.out.println("Employee Name: "+this.name);
		System.out.println("Designation: "+this.designation);
		System.out.println("Academic Position: "+this.academicPosition);
	}
}

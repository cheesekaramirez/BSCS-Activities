package chescaWorkspace;
import java.util.Scanner;
public class arrayIntro {

	public static void main(String[] args) {
		int counter=0;
		String[] items = {"","","",""};
		Scanner scn= new Scanner(System.in);
		System.out.print("Enter item 1:"+"\t");
		items[0]= scn.nextLine();
		System.out.print("Enter item 2:"+"\t");
		items[1]= scn.nextLine();
		System.out.print("Enter item 3:"+"\t");
		items[2]= scn.nextLine();
		System.out.print("Enter item 4:"+"\t");
		items[3]= scn.nextLine();
		
		System.out.print("The items are: \t");
		/* for(int counter=0;counter<=items.length&&counter<4;counter++) {  //Sure...you can do things this way...
			if (counter==3) {
			System.out.print(items[counter]);
			} else {
			System.out.print(items[counter]+", ");
			} */
		for(String i: items) { //i is for index
			if (counter==3) {
				System.out.print(items[counter]);
				} else {
				System.out.print(items[counter]+", ");
				}
		}
	
			scn.close();
		}
	}



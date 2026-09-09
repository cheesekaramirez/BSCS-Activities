package chescaWorkspace;
import java.util.Scanner;


public class ReverseSquare { //Successful Coding!
	
	public static void main(String[] args) {
		int num; 
		int currentNum;
		Scanner scn= new Scanner(System.in);
		System.out.print("Enter number:"+"\t");
		num=scn.nextInt();
		currentNum= sqr(num);
		reverseSquare(currentNum,num);
	}
	
	public static void reverseSquare(int currentNum, int num) {
		int row;
		int counter2;
		
		for(row=1;row<=num;row++) 
		{
			if((row%2)!=0) 
			{
			for(counter2=1;counter2<=num;counter2++,currentNum--) 
			{
				System.out.print(currentNum+"\t");
			}
			} else 
			{
				int temp = currentNum-num+1; //next time,use your math		
				for(counter2=1;counter2<=num;counter2++,temp++) 
				{
					System.out.print(temp+"\t");
				}
				currentNum-=num;
			}
			
			System.out.println();
		}
		
	}
	
	
	public static int sqr(int num) 
	{
		int s;
		s= num*num;
		return s;
	}

}

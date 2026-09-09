package chescaWorkspace;

import java.text.DecimalFormat;
import java.util.Scanner;



public class FibonacciNumsRecursive {
	
	public static long[] fibCache; //Memoization is a caching technique.
	
	public static void main(String[] args) 
	{
		DecimalFormat df = new DecimalFormat("###,###,###,###,###,###,###");
		Scanner input = new Scanner(System.in);
		String affix[] = {"st","nd","rd","th"};
		String ordinalAffix;
		System.out.print("Enter the nth term you want get: ");
		int n = input.nextInt();
		
		if (n>92) 
		{
			System.err.print("You cannot enter a number bigger than 92.");
			System.exit(0);
		} 
		else 
		{
			input.close();
			
			fibCache= new long[n+1]; 
			
			if (n==1) 
			{
				ordinalAffix=affix[0];
			} else if((n%10)==2 && n!=12) 
			{
				ordinalAffix=affix[1];
			}
			else if((n%10)==3 && n!=13) 
			{
				ordinalAffix=affix[2];
			} else {
				ordinalAffix=affix[3];
			}
			
			
			long result = fibonacci(n);
			System.out.println("The "+n+ordinalAffix+" term of the Fibonacci Sequence is "+df.format(fibonacci(n))+".");
			System.out.println();
		}
	}
	
	
	
	
	public static long fibonacci(int n) 
	{
		if (n <= 1) 
		{
			return n;
			
		}
		
		if (fibCache[n] != 0) {
			return fibCache[n];
		}
		
		long nthFibonacciNum= (fibonacci(n-1)+fibonacci(n-2));
		fibCache[n]= nthFibonacciNum;
		return nthFibonacciNum;
	}

}

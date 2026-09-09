package dsa;
import java.util.Scanner;
import java.util.Arrays;

public class MachineProblemComplete {
	

	public static void main(String[] args) 
	{
		int n;
		int choice;
		Scanner scn = new Scanner(System.in);
		System.out.println("Machine Problem");
		System.out.println();
		System.out.print("Enter a number: ");
		n=scn.nextInt();
		System.out.println("Choose an option:");
		System.out.println("[1] Sum of Digits");
		System.out.println("[2] Number Reverser");
		System.out.println("[3] Sieve of Eratosthenes");
		System.out.println("[4] Palindrome Checker");
		System.out.println("[5] Odd or Even");
		System.out.println("[6] Terminate Program");
		System.out.println();
		System.out.print("Enter option number: ");
		choice=scn.nextInt();
		scn.close();
		switch(choice) 
		{
			case 1:
				sumOfDigits(n);
				break;
			case 2:
				String numStr=numToString(n);
				int result=reverseNum(numStr);
				System.out.printf("The reverse of %d is %d.",n,result);
				break;
			case 3:
				//sieveOfEratosthenes(n);
				break;
			case 4:
				palindromeChkPrnt(n);
				break;
			case 5:
				//oddOrEven(n);
				break;
			case 6:
				System.out.print("Developed by Chesca");
				System.exit(0);
			default:
				System.err.print("Not a supported number or symbol. Please run the program again.");
		}
		
	}
	
	public static void sumOfDigits(int n) 
	{
		int[] numArray=intToArray(n);
		int sum=Arrays.stream(numArray).sum();
		
		System.out.printf("The sum of all the digits of %d is %d.",n,sum);
		
	}
	
	public static int[] intToArray(int n) 
	{
		char[] intChars=Integer.toString(n).toCharArray();
		int[] digits= new int[intChars.length];
		for(int i=0;i<intChars.length;i++) 
		{
			digits[i]=intChars[i]-'0';
		}
		
		return digits;
		
	}
	 
	
	public static String numToString(int n)
	{
		String numStr=Integer.toString(n);
		return numStr;
	}
	
	 
	
	public static String numReverser(String n)
	{
		String reverseNum;
		char firstNum=n.charAt(0);
		if (n.length()==0||n.length()==1) 
		{
			return n;
		} else {
			reverseNum=numReverser(n.substring(1))+firstNum;
			return reverseNum;
		}
		
		
	}
	
	public static int reverseNum(String n) 
	{
		int parsedNum=Integer.parseInt(numReverser(n));
		return parsedNum;
	}
	
	public static boolean palindromeChecker(int n) 
	{
		int reverseNum=reverseNum(Integer.toString(n));
		if (reverseNum==n) 
		{
			return true;
		}
		return false;
	}
	
	public static void palindromeChkPrnt(int n) 
	{
		boolean isPalindrome=palindromeChecker(n);
		int reverseNum=reverseNum(Integer.toString(n));

		if(isPalindrome==true) 
		{
			System.out.printf("%d is a palindrome of %d.",reverseNum,n);
		} else {
			System.out.printf("%d is not a palindrome of %d.",reverseNum,n);
		}
	}

}

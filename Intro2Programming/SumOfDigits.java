package chescaWorkspace;

public class SumOfDigits {

	public static void main(String[] args) {
		
		int n=401;
		System.out.println(sumOfDigits(n));
		
	}
	
	public static int sumOfDigits(int n) 
	{
		int lastDigit;
		if (n<10) {
		return n;
		} 
			return n%10+sumOfDigits(n/10);
	}

}

package chescaWorkspace;

public class PalindromeDetector {

	public static void main(String[] args) {
		String s= "Nan.";
		System.out.println(reverseString(s));
		System.out.println("Palindrome? "+isPalindrome(reverseString(s),s));
	}
	
	public static String reverseString(String s) 
	{
		if(s.length()==0 || s.length()==1) 
		{
			return s;
		} else {
			char firstLetter= s.charAt(0);
			return reverseString(s.substring(1)) + firstLetter;
		}
		
	}
	
	public static boolean isPalindrome (String s, String ogWord) 
	{
		if (s.equals(ogWord)) 
		{
			return true;
		} else {
			return false;
		}
	}

}

package chescaWorkspace;

public class StringReverser {

	public static void main(String[] args) {
		String s= "Mother knows best!";
		System.out.println(reverseString(s));
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

}

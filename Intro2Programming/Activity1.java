package chescaWorkspace;

// TO-DO 

public class Activity1
{
public static void main(String[] args) 
{
String tof= "No.";
 String str = "A man, a plan, a canal, Panama!"; //A palindrome.
 String myOutputString= createMyOutput(str); // Calls createMyOutput() method  with the string and gets its value and assigns it to self.
 boolean isMyOutput=isMyOutput(myOutputString); // Calls isMyOutput() method.
 System.out.println("My String\t\t:" +str); // (12- 14) Prints results
 System.out.println("My Output String\t:" +myOutputString);
 if (isMyOutput) 
 {
	 tof="Yes.";
 }
 System.out.println("Is \"" + myOutputString + "\" my Output? \n" + tof);
}
public static String createMyOutput(String str)  // Solely for optimization purposes. Basically proxy for reverseString().
{ 
 String reverseStr = reverseString(str);
 return reverseStr;
}
public static boolean isMyOutput(String str) // Checks if the output is a palindrome.
{
 str=manipulate(str);
 int start = 0;
 int end = str.length() - 1;
 while (start < end) 
 {
if (str.charAt(start) != str.charAt(end)) 
{
 return false;
}
 start++;
 end--;
 }
 return true; 
}
 
public static String manipulate(String str1) 
{
 str1 = str1.toLowerCase(); 
 str1 = str1.replaceAll("[^a-zA-Z0-9]", ""); // Cleans the string of any characters that may make the output inaccurate.
 return str1;
}
public static String reverseString(String str) 
{
 str=manipulate(str);
 char[] charArray = str.toCharArray();
 int start = 0;
 int end = str.length() - 1;
 while (start < end) 
 {
char temp = charArray[start];
 charArray[start] = charArray[end];
 charArray[end] = temp;
 start++;
 end--;
 }
 return new String(charArray);
}
}


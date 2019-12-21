package stringmethods;

public class CharAtExampleMain3 {

	public static void main(String args[])
	{
		String str="welcome to FACE portal";
		int strlength=str.length();
		//fetching first char
		System.out.println("Character at 1st index is:"+str.charAt(1)); //prints value of ch  
		System.out.println("Character at last index is:"+str.charAt(strlength-1)); //prints last char in the string
  	}
}

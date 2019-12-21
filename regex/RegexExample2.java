package regex;
import java.util.regex.*;
public class RegexExample2 
{
	public static void main(String args[])
	{
		Pattern pattern = Pattern.compile("Fa[a-z]e");  //regex of characters from a to z
		Matcher m= pattern.matcher("Fake");
		if(m.find())
		{
			System.out.println("true");
		}
		else
			System.out.println("false");
		
		System.out.println(Pattern.matches("Fa[ac]e", "Fake"));
		System.out.println(Pattern.matches("Do\\[", "Do["));	     //using escape sequences
		System.out.println(Pattern.matches("Do[\\[\\]]", "Do]"));	//using escape sequences
		System.out.println(Pattern.matches("Hi\\d", "HiS"));		//using escape sequences
		System.out.println(Pattern.matches("Hi\\D", "HiS"));		//using escape sequences
		System.out.println(Pattern.matches("Hello\\sWorld", "Hello World"));	//using escape sequences
		System.out.println(Pattern.matches("Hello\\SWorld", "Hello World"));	//using escape sequences
		System.out.println(Pattern.matches("Hi\\wWorld", "HiSWorld"));			//using escape sequences
		System.out.println(Pattern.matches("Hi\\WWorld", "HiSWorld"));			//using escape sequences
		Pattern p1 = Pattern.compile("\\A[a-zA-Z]");  //range of character from a-z and A-Z
		Matcher m1 = p1.matcher("Be Strong");
		while(m1.find())
			System.out.println(m1.group());
	}

}

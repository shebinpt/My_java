package regex;
import java.util.regex.*;
public class RegexExample1 
{
	public static void main(String args[])
	{
		String content="Face - Focus Academy for career Enhancement - Face";
		String string="Face";
		Pattern pattern=Pattern.compile(string);  //patternclass used to define pattern to be compared
		Matcher matcher=pattern.matcher(content);  //matcher class used to match pattern with pattern string
		while(matcher.find())
		{
			System.out.println("Found at: "+matcher.start()+"-"+(matcher.end()-1));  //prints  of matchiing pattern index
		}
		  
		System.out.println(Pattern.matches("focu.","focus")); //returns true : "." come any character
		System.out.println(Pattern.matches("face","face")); //returns true: both patterns matching
		System.out.println(Pattern.matches("fa*","faa"));  //true: * means occurance of previous character
		System.out.println(Pattern.matches("fa*e","fake"));  //false: fa*e means faae which is not match with fake
	}

}

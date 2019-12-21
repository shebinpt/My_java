package stringmethods;

public class ConcatExample1 
{
public static void main(String args[]) 
{
	String s1="java string";
	s1.concat("is imutable"); //doesnt work beause of string's immutable property
	System.out.println(s1);
	s1=s1.concat("is immutable so assign it explicitly");	//concatinate this values here.
	System.out.println(s1);
}
}

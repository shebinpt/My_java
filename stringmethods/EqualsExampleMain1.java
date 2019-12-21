package stringmethods;

public class EqualsExampleMain1 
{
	public static void main(String args[])
	{
		String s1="facenow";
		String s2="facenow";
		String s3="faceprep";
		String s4="facenxt";
		System.out.println(s1.contentEquals(s2)); //checks s1 and s2 are equal or not
		System.out.println(s1.contentEquals(s3)); //checks s1 and s3 are equal or not
		System.out.println(s1.contentEquals(s4)); //checks s1 and s4 are equal or not
	}

}

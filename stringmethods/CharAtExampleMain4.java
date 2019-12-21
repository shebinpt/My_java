package stringmethods;

public class CharAtExampleMain4 {

	public static void main(String args[])
	{
		String str="welcome to FACE portal";
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='t')
				count++;			//incremented at character t occurance
		}
		//fetching first char
		System.out.println("Frequncy of t is:"+count); //prints occurance of t  
		
  	}
}

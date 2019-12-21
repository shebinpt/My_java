package stringmethods;

import java.util.ArrayList;

public class EqualsExampleMain2 
{
	public static void main(String args[])
	{
		String str1="FACENXT";
		ArrayList<String> list= new ArrayList<>();    //creating array list
		//adding string to the arraylist
		list.add("FACE");
		list.add("FACEPREP");
		list.add("FACENXT");
		list.add("FACENOW");
		for(String str : list)
		{
			if(str.contentEquals(str1))  //searching occurance of str1 in list
			{
				System.out.println("FACENXT is present");
			}
		}
	}

}

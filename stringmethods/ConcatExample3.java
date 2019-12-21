package stringmethods;

public class ConcatExample3 
{
public static void main(String args[]) 
{
	String str1="hello";
	String str2="Face@2.0";
	String str3="Reader";
	//concatinationg space among string 
	String str4=str1.concat(" ").concat(str2).concat(" ").concat(str3); 
	System.out.println(str4);
	String str5=str1.concat("!!!");	//concatinating special characters
	System.out.println(str5);
	String str6=str1.concat("@").concat(str2);	//concatinating special characters
	System.out.println(str6);
}
}

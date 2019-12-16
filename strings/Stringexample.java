package strings;

public class Stringexample {
public static void main(String args[])
{
String str="I, amm, going, to, split, this, by, space";
String[] str1=str.split(",");
for(String a:str1)
	System.out.print(a);
}
}

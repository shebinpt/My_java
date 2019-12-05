package Abstraction;
import java.util.Scanner;
public class Mainjava {
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		Inheritant ob=new Inheritant();
		ob.add(a,b);
		ob.sub(a,b);
		ob.div(a,b);
		ob.mul(a,b);
	}

}

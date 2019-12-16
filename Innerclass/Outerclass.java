package Innerclass;

public class Outerclass {
private int a=10;
public class Inner
{
void fun()
{
	System.out.println(a);
	}
}

public static void main(String args[])
{
	
Outerclass.Inner ob=new Outerclass().new Inner();

ob.fun();
}
}

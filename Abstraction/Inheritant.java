package Abstraction;

public class Inheritant implements Interface1, Interface2{
public void add(int a,int b)
{
	System.out.println(a+b);
	}

public void div(int a,int b)
{
	System.out.println(a/b);
	}

public void sub(int a,int b)
{
	System.out.println(a-b);
	}

public void mul(int a,int b)
{
	System.out.println(a*b);
	}
}

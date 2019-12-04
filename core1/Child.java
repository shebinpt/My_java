package core1;

public class Child extends Inheritance{
	void add(int x,int y)
	{
		int a=x;
		int b=y;
		System.out.println(a*b);
	}
	public static void main(String args[])
	{
		Inheritance ob=new Child();
		Inheritance ob1=new Inheritance();
		ob.add(10, 5);
		ob1.add(10, 5);
	}

}

package core1;
import java.lang.*;
public class Overload {
	
	void area(int x,int y)
	{
		System.out.println("Area of recatangle is:"+x*y);
	}
	void area(int x)
	{
		System.out.println("Area of Square is:"+x*x);
	}
	void area(float x)
	{
		System.out.println("Area of Circle is:"+(3.14*x*x));
	}
	void area(int x,int y,int z)
	{
		float s=(x+y+z)/2;
		float d=(float)Math.sqrt(s*((s-x)*(s-y)*(s-z)));
		System.out.printf("%f.2f Area of Triangle is:",d);
	}
	
	
	public static void main(String args[])
	{
		Overload ob=new Overload();
		ob.area(4,5);
		ob.area(4);
		ob.area(3.0f);
		ob.area(4,5,6);
		
		
	}

}

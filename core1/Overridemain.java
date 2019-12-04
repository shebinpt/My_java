package core1;
import java.util.Scanner;
public class Overridemain extends Override{

	  void cal(int x,int y)
{
	System.out.print(x-y);
}

public static void main(String args[])
{
	Scanner ws=new Scanner(System.in);
	Override ob1=new Override();
	Override ob2=new Override1();
	Overridemain ob3=new Overridemain();
	
	System.out.println("enter two numbers:");
	int x=ws.nextInt();
	int y=ws.nextInt();
	
	ob1.cal(x, y);
	ob2.cal(x, y);
	ob3.cal(x, y);
}
}

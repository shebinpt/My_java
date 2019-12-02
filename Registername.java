package registerpack;

import java.io.IOException;
import java.util.Scanner;

public class Registername {
	String name; 
	String address;
	String contactno;
	String emailid;
	String proof;
	String proofid;
	String a;
	
	static int reg=0;
	static int arr[]=new int[25];
	public static void main(String args[]) throws IOException {
		Registername obj[]=new Registername[25];
		String d;
	int i=0;
	do
	{
		 obj[i]=new Registername();
	Scanner s=new Scanner(System.in);
	System.out.println("Registration");
	System.out.println("Enter your name");
	    obj[i].name=s.nextLine();
	System.out.println("Enter your address");
	obj[i].address=s.next();
	System.out.println("Enter your Contact Number");
	obj[i].contactno=s.next();
	System.out.println("Enter your E-Mail ID");
	obj[i].emailid=s.next();
	System.out.println("Enter your proof type");
	obj[i].proof=s.next();
	System.out.println("Enter your proof ID");
	obj[i].proofid=s.next();
	System.out.println("Thank you for registering."+"Your ID is :"+ ++reg);
	
	arr[reg-1]=reg;
	System.out.println("Do you want to Continue Registration(y/n)");
	d=s.next();
	i++;
	}
	while(d.equals("y"));
	Viewname.view(obj,i);
}
}

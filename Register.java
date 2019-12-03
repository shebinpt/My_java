package simpleregister;

import java.io.IOException;
import java.util.Scanner;


public class Register {
	String name; 
	String address;
	String contactno;
	String emailid;
	String proof;
	String proofid;
	String a;
	
	 int reg=0;
	 int arr[]=new int[25];
	 
	public static void main(String args[]) throws IOException {
		Register obj[]=new Register[25];
		String d;
	int i=0;
	do
	{
		 obj[i]=new Register();
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
	
	System.out.println(obj[i].name);
	System.out.println(obj[i].address);
	System.out.println(obj[i].contactno);
	System.out.println(obj[i].emailid);
	System.out.println(obj[i].proof);
	System.out.println(obj[i].proofid);
	System.out.println("Thank you for registering."+"Your ID is :"+ ++obj[i].reg);
	
	obj[i].arr[obj[i].reg-1]=obj[i].reg;
	System.out.println("Do you want to Continue Registration(y/n)");
	d=s.next();
	i++;
	}
	while(d.equals("y"));
	
}

}

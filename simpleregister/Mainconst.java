package simpleregister;

import java.io.IOException;
import java.util.Scanner;

public class Mainconst {
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
		Registerconst ob1[]=new Registerconst[25];	/*object for Redgisterconst creating*/
		Mainconst obj[]=new Mainconst[25];			/*object for Mainconst creating...(Array of objects using here*/
		String d;
	int i=0;
	do
	{
		 obj[i]=new Mainconst();						/*object for mainconst is initializing here*/
	Scanner s=new Scanner(System.in);
	System.out.println("Registration");
	//values reading with object
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
	
	obj[i].reg++;
	
	obj[i].arr[obj[i].reg-1]=obj[i].reg;/*	register id count works here*/
	ob1[i]=new Registerconst(obj[i].name, obj[i].address,obj[i].contactno, obj[i].emailid, obj[i].proof, obj[i].proofid);/* object for constructor Re3gisterconst initializing .*/
	ob1[i].display();
	System.out.println("Do you want to Continue Registration(y/n)");
	d=s.next();
	i++;
	}
	while(d.equals("y"));
	
}

}

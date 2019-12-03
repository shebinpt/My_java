package simpleregister;

import java.io.IOException;
import java.util.Scanner;

public class Register_set_get {
	String name; 
	String address;
	String contactno;
	String emailid;
	String proof;
	String proofid;
	String a;
	
	 int reg=0;
	 int arr[]=new int[25];
	 void setname(String name)
	 {
		 this.name=name;
	 }
	 void setaddress(String address)
	 {
		 this.address=address;
	 }
	 void setcontactno(String contactno)
	 {
		 this.contactno=contactno;
	 }
	 void setemailid(String emailid)
	 {
		 this.emailid=emailid;
	 }
	 void setproof(String proof)
	 {
		 this.proof=proof;
	 }
	 void setproofid(String proofid)
	 {
		 this.proofid=proofid;
	 }
	 
	 //set function starts here:/
	 String getname()
	 {
		 return name;
	 }
	 String getaddress()
	 {
		 return address;
	 }
	 String getcontactno()
	 {
		 return contactno;
	 }
	 String getemailid()
	 {
		 return emailid;
	 }
	 String getproof()
	 {
		 return proof;
	 }
	 String getproofid()
	 {
		 return proofid;
	 }
	 
	 
	 //main function starts:
	 public static void main(String args[]) throws IOException {
			
			Register_set_get obj=new Register_set_get();
			 
			/*object for class creating...*/
			String d;
		int i=0;
		do
		{
									/*object for mainconst is initializing here*/
		Scanner s=new Scanner(System.in);
		System.out.println("Registration");
		//values reading with object
		System.out.println("Enter your name");
		    obj.setname(s.nextLine());
		System.out.println("Enter your address");
		obj.setaddress(s.next());
		System.out.println("Enter your Contact Number");
		obj.setcontactno(s.next());
		System.out.println("Enter your E-Mail ID");
		obj.setemailid(s.next());
		System.out.println("Enter your proof type");
		obj.setproof(s.next());
		System.out.println("Enter your proof ID");
		obj.setproofid(s.next());
		
		
		
		//ob1=new Registerconst(obj.name, obj.address,obj[i].contactno, obj[i].emailid, obj[i].proof, obj[i].proofid);/* object for constructor Re3gisterconst initializing .*/
		
		//display using get functionn starts here:
		System.out.println(obj.getname());
		System.out.println(obj.getaddress());
		//in this case it refers global variable name , and address.
		System.out.println(obj.getcontactno());
		System.out.println(obj.getemailid());
		System.out.println(obj.getproof());
		System.out.println(obj.getproofid());
		System.out.println("Thank you for registering."+"Your ID is :"+ ++obj.reg);
		obj.arr[(obj.reg)-1]=obj.reg;/*	register id count works here*/
		System.out.println("Do you want to Continue Registration(y/n)");
		d=s.next();
		i++;
		}
		while(d.equals("y"));
		
	}
}

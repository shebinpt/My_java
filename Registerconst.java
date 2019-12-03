package simpleregister;

public class Registerconst {
	String name; 
	String address;
	String contactno;
	String emailid;
	String proof;
	String proofid;
	String a;
	
	static int reg=0;
	static int arr[]=new int[25];
	Registerconst(String name, String address, String contactno, String emailid, String proof, String proofid)
	{
		this.name=name;
		this.address=address;
		this.contactno=contactno;
		this.emailid=emailid;
		this.proof=proof;
		this.proofid=proofid; 
		
	}
void display()
{
	System.out.println(this.name);
	System.out.println(this.address);
	//in this case it refers global variable name , and address.
	System.out.println(contactno);
	System.out.println(emailid);
	System.out.println(proof);
	System.out.println(proofid);
	System.out.println("Thank you for registering."+"Your ID is :"+ ++reg);
	//we can call global variable here without this keryword
}
}

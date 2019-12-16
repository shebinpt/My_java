package JavaMISC;

public class Objectclass {
static int last_roll=100;
int roll_no;

//constructor
Objectclass()
{
	roll_no=last_roll;
	last_roll++;
	}

public int hashCode()
{
	return roll_no;
}
public static void main(String args[])
{
Objectclass s=new Objectclass();
System.out.println(s);
System.out.println(s.toString());
Object obj=new String("FACE");
Class c=obj.getClass();
System.out.println("Class of object is:"+c.getName());
s=null;
System.gc();
//garbag e collection
}
protected void finalize()
{
	System.out.println("Finilized mathod called");	
}
}


package registerpack;

public class Viewname  {
	public static void view(Registername obj[],int n)
	{
		System.out.println("Customers list");
		System.out.println("The registered customers are");
		System.out.print("Customer ID"+"	");
		System.out.println("Customer Name");
		for (int i=0;i<n;i++)
		{
			System.out.print(Registername.arr[i]);
			System.out.print("\t\t"+obj[i].name);
		}
	}

}

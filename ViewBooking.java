package registr;

import java.util.Scanner;
public class ViewBooking{


public void date() {
	// TODO Auto-generated method stub
	System.out.println("View all book");
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Start date");
	int a=sc.nextInt();
	System.out.println("Enter the End date");
	int b=sc.nextInt();
	System.out.print("custom id\t\t");
	System.out.println("Room");
	for(int i=0;i<25;i++)
	{
	 if(RoomRegister.date[i]>=a && RoomRegister.date[i]<=b)
	 {
		 System.out.print(CustomerRegistration.custom[i]+"\t");
		System.out.print(RoomRegister.book[i]);
	 }
}
}
}
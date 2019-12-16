package Innerclass;
interface It1{
	void fun();
}
public class Outer {
	public static void main(String args[]) {
	It1 ob=new It1() {
public void fun()
{
	System.out.print("Anonymous class");
	}};
ob.fun();}
}

package stringmethods;

import java.util.Scanner;
import java.util.*;
public class main1 {
   public static void main(String args[])
     {
         
    Scanner s=new Scanner(System.in);
	  int a=s.nextInt();
	  String str=Integer.toString(a);
	  int n=str.length();
	  for(int i=0;i<n;i++)
	  {
	      int t=Character.getNumericValue(str.charAt(i));
	      System.out.print(t+1);
	  }
     }
  }
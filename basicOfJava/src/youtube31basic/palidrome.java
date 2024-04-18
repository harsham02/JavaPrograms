package youtube31basic;

import java.util.*;
public class palidrome {

	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
		System.out.println("enetr a String :");
		String str = sc.next();
		
		 palidromeString(str);
		 
			System.out.println("enetr a number :");
			int num = sc.nextInt();
			 palidromeNumber(num);
	}

	public static void palidromeString(String str )
	{
		String temp = str;
	String rev ="";
	
	for(int i=0;i<str.length();i++)
	{
		char ch = str.charAt(i);
		
		rev = ch + rev;
	}
	
	if(temp.equals(rev))
	{
		System.out.println("the given string "+temp+ " is a palidrome");
	}else
	{
		System.out.println("the given string "+temp+ "is not a  palidrome");
	}
	}
	
	public static void palidromeNumber(int num)
	{
		int rev=0, rem;
		int temp = num;
		while(num!=0)
		{
			rem = num %10;
			rev = rev * 10 + rem;
			num/=10;
		}
		
		if(temp==rev)
		{
			System.out.println("the given number "+temp+ " is a palidrome");
		}else
		{
			System.out.println("the given number "+temp+ " is not a  palidrome");
		}
	}
}

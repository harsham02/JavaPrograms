package youtube31basic;

import java.util.*;

public class revNumAndString {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		
		//reverse a Stirng 
		System.out.println(" enter a String : ");
		String str = sc.nextLine();
		
		System.out.println("The reversed String is : "+strReverse(str));
		
	System.out.println(" enter a number : ");
	int num = sc.nextInt();
	
	System.out.println("The reversed Number is : "+numReverse(num));
	

	}

	public static String strReverse(String str)
	{
	    String rev ="";
	    
	    for(int i=0;i<str.length();i++)
	    {
	    	char ch = str.charAt(i);
	    	
	    	rev =  ch + rev;
	    	
	    }
	    return rev;
	}
	public static int numReverse(int num) {
		
		int res =0, rem;
		while(num!=0)
		{
			rem = num %10;
			res = res * 10 + rem;
			num/=10;  	
		}
		
		return res;
	}
}

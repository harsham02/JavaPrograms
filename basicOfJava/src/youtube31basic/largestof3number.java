package youtube31basic;
import java.util.*;
public class largestof3number {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println(" Enter 3  numbers ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if( a > b && a > c)
		{
			System.out.println(a+ " is a greatest number ");
		}else if(b > c && b > a)
		{
			System.out.println(b+ " is a greatest number");
		}else
		{
			System.out.println(b+ " is a greatest number");	
		}
		
	}

}

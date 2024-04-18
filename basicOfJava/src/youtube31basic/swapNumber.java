package youtube31basic;
import java.util.*;
public class swapNumber {

	public static void main(String[] args) {
 
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the two numbers to swap :");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println("The numbers before swappings are "+a+" and "+b);
		
		//without using 3rd variable
//		a = a + b;
//		b = a-b;
//		a = a-b;
		
		//using 3rd  variable
		
		int temp;
		temp = a;
		a = b;
		b = temp;
        System.out.println("The numbers after swappings are "+a+" and "+b);	
	}

}

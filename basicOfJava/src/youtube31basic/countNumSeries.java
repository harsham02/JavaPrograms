package youtube31basic;
import java.util.*;
public class countNumSeries {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		// count of digits in a number
		System.out.println("enter a number : ");
		int num = sc.nextInt();
		
		int count = countDigits(num);
		
		System.out.println("The count of digits in the number are : "+count);
		
		// count the numbers of ever and odd digits 
		
		int even = evenDigits(num);
		
		System.out.println("the count of the even digits in the number are : "+even);
		
		int odd = oddDigits(num);
		System.out.println("the count of the odd digits in the number are : "+odd);
		
		// count the sum of digits in a number 
		int sum = sumOfDigits(num);
		System.out.println(" the sum of thr digits in the number is : "+sum);
	}
	public static int sumOfDigits(int num)
	{
		int sum=0;
		while(num!=0)
		{
			int n = num%10;
						
			num/=10;
			sum+=n;
			
		}
		
		
		return sum;
	}
	public static int evenDigits(int num)
	{
		int c=0, rem;
		while(num!=0)
		{
			rem = num/=10;
			
         if(rem%2==0)
         {
        	 c++;
         }
		}
		
		return c;
	}
	
	public static int oddDigits(int num)
	{
		int c=0, rem;
		while(num!=0)
		{
			rem = num/=10;
			
         if(rem%2!=0)
         {
        	 c++;
         }
		}
		
		return c;
	}
	
public static int countDigits(int num)
{
	int count=0;
	
	while(num!=0)
	{
		num/=10;
		
		count++;
	}
	
	return count;
}
}

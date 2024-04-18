package youtube31basic;

import java.util.Arrays;

public class Prime {

	public static void main(String[] args) {

		int[] arr = new int[1000];
		  int size=0;	  
		for(int i=0;i<7920;i++)
		{
          	if(isPrime(i))	// checking the number is prime or not 
			{
				arr[size++] = i;  // if the number is prime adding that number into array.
			}
		}
		int count =0;
	//printing the array elements
	System.out.println("The first 1000 prime numbers are : ");	
		for(int i=0;i<arr.length;i++)
		{
			
		  System.out.print(arr[i] +" ");
		  count++;    //count the array elements
			
		}	
		
		int sum = sumOfPrimeNum(arr);
		System.out.println();
		System.out.println("Total count of the prime numbers in the array is : "+count);
		System.out.println("the sum of the prime numbers : "+ sum);
	}
	
	// method to count the sum of prime numbers
	public static int sumOfPrimeNum(int[] arr)
	{
		int sum =0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=0)
			{
		   sum+=arr[i];
			}
		}		
		return sum;
	}
	
	//method to check number is prime or not
public static boolean isPrime(int n)
{
	if(n==1 || n==0)
		return false;
	if(n==2)
		return true;
	
	for(int i= 2;i<=n/2;i++)
	{
		if(n%i==0)
			return false;
	}
	
	return true;
}
	
}

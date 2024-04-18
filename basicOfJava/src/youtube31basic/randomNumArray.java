package youtube31basic;

import java.util.*;
public class randomNumArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// random number generator
		Random rand = new Random();
		int[] arr = new int[10];
		
		for(int i=0;i<arr.length;i++)
		{
			arr[i] = rand.nextInt(10,200);
		}
		
		System.out.println(Arrays.toString(arr));
		
		//find the sum of Array
		
		int sum =0;

		for(int i=0;i<arr.length;i++)
		{
			sum+=arr[i];
		}
		System.out.println("the sum of array is : "+sum);
		
	//print even and odd numbers in an array
		System.out.println("the even numbers in the arrays are : ");
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
				System.out.print(arr[i]+" ");
			}
		}
		
		System.out.println();
		System.out.println("the odd numbers in the arrays are : ");
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2!=0)
			{
				System.out.print(arr[i]+" ");
			}
		}
	}

}

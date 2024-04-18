package youtube31basic;

import java.util.*;
public class linearSearch {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int[] arr = {12,23,43,45,76,10,34,21};
		
		System.out.println("Enter the key element to search : ");
		int key = sc.nextInt();
		
		int index = linearSearch(arr,key);
			
		if(index<0)
		{
			System.out.println(" your searched "+key+" is not found ");
		}else {
			System.out.println(" your searched "+key+ " is found at position : "+(index+1));
		}
	}
	
	public static int linearSearch(int arr[], int key)
	{
		int index=-1;
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==key)
			{
				index = i;
			}
		}
		return index;
	}
}

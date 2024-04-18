package youtube31basic;

import java.util.Scanner;

public class binarySearch {

	public static void main(String[] args) {
   
		Scanner sc = new Scanner(System.in);
		int[] arr = {12,21,23,33,56,66,78,90};
		
		System.out.println("Enter the key element to search : ");
		int key = sc.nextInt();
		int last = arr.length-1;
		int first =0;
		
		binarySearch(arr,first,key,last);
	}

	private static void binarySearch(int[] arr, int first, int key, int last) {
      
		int mid = (first + last) /2;
		
		while(first <= last)
		{
			if(arr[mid] < key)
			{
				first = mid +1;
			}else if(arr[mid] == key)
			{
				System.out.println(key+" is fount at position : "+(mid+1));
			break;
			}else {
			
			last = mid -1;
			}
			mid = (first + last)/2;
		}
		
		if(first > last)
		{
			System.out.println(" key is not found");
		}
		
	}

}

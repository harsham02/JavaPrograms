package youtube31basic;

import java.util.Arrays;

public class Practice1 {

	public static void main(String[] args) {

	int arr[] = {-5,10,11,12,32,34,54};
	
	//selection sort....
	
	int key =32;
	int first =0;
	int last = arr.length-1;
	
	binarySearch(key,first,arr,last);
	}

	private static void binarySearch(int key, int first, int[] arr, int last) {
	
		int mid = (first + last)/2;
		
		while(first <= last)
		{
			if(arr[mid] < key)
			{
				first = mid +1;
			}else if(arr[mid] == key){
				System.out.println("key is found at "+mid);
				break;
			}else {
				last = mid -1;
			}
			mid = (first+last)/2;
		}
		
		if(first > last)
		{
			System.out.println(" not found");
		}
	}

}

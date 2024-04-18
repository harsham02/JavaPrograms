package java2blogs;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		
		int[] arr = {34,21,11,4,65,6,23};
		
	for(int i=0;i<arr.length;i++)
	{
		int min_index = i;
		for(int j=i+1;j<arr.length;j++)
		{
			if(arr[min_index] > arr[j])
			{
			min_index = j;	
			}
		}
		int temp = arr[min_index];
		arr[min_index] = arr[i];
		arr[i] = temp;
	}
		
System.out.println(Arrays.toString(arr));
	}

}

package java2blogs;

import java.util.Arrays;

public class SeparateZeroOneInAnArray {

	public static void main(String[] args) {
//		Given an array of 0’s and 1’s in random order, you need to separate 0’s and 1’s in an array.
	
//	int arr[] = {0,1,0,0,1,1,1,0,1};
		int arr[] = {1, 2, 2, 0, 0, 1, 2, 2, 1};
//		Array after separating 0 and 1 numbers :
//		{0,0,0,0,1,1,1,1,1}
		
		System.out.println(Arrays.toString(sortArr(arr)));
		System.out.println(Arrays.toString(sortArrMethod2(arr)));
	}

	private static int[] sortArrMethod2(int[] arr) {

		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]> arr[j]) {
				int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
				}
			}
		}
		return arr;
	}

	private static int[] sortArr(int[] arr) {
     
		int count =0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==0)
			{
				count++;
			}
		}
		for(int i=0;i<=count;i++)
		{
			arr[i] =0;
		}
		for(int i=count;i<arr.length;i++)
		{
			arr[i] =1;
		}
		return arr;
	}

}

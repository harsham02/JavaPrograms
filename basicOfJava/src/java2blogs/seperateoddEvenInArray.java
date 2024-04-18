package java2blogs;

import java.util.Arrays;

public class seperateoddEvenInArray {

	public static void main(String[] args) {


int arr[] = {12, 17, 70, 15, 22, 65, 21, 90};
//  Array after separating odd and even numbers :
//  12, 90, 70, 22, 15, 65, 21, 17}

System.out.println(Arrays.toString(sepearteOddEven(arr)));
	}

	private static int[] sepearteOddEven(int[] arr) {
		
		int left =0;
		int right = arr.length-1;
		
		for(int i=0;i<arr.length;i++)
		{
			while(arr[left]%2==0)
			{
				left++;
			}
			while(arr[right]%2!=0)
			{
				right--;
			}
			
			if(left<right) {
			int temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;	
			}
		}
		
		return arr;
	}
}

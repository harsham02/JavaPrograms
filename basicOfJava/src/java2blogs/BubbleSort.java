package java2blogs;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {12,32,11,10,34,54,12,-5,19};
		
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j =0;j<arr.length-i-1;j++)
			{
				if(arr[j] > arr[j+1])
				{
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
		
	}

}

package techWithJatin;

import java.util.Arrays;

public class zeroToendOFArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {1,0,2,0,1,2,1};
		
		int right=0;
		
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i] !=0)
			{
				int temp = arr[i];
				arr[i] = arr[right];
				arr[right] = temp;
				right++;
			}
		}
		System.out.println(Arrays.toString(arr));
		
		String str = "hello";
		reverseString(str);
	}

	private static void reverseString(String str) {
		//reverse string
		String s="";
		for(int i=str.length()-1;i>=0;i--)
		{
			char ch = str.charAt(i);
			s +=ch;
		}
		System.out.println(s);
	}

}

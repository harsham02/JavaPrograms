package HackerRank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class lexicoGraphicalOrder {

//	Lexicographical Order, also known as alphabetic or dictionary order, orders characters as follows:
	

	public static void main(String[] args) {
	

	String s = "ZASKFDLklhfsdfsDLJFSJGIHEKHIPEINNNFIGHKkjgksfgjrotyotoyjtkjkLJOIOEHEKHKKDJGKFGJkfjhglfhjtrhkjfkhjnfglhkjflgjhtrljhfljhfgljhfgljhfgljhtrklyjhtrkjhfgkljhfgjhfljhtrljlfjhfgljhfglkjhflyjtljtrlyjhtryjtrtykhrktherktjhtrkyjhkujhtykhtryhrthHKLJHLHRLHTLRHLKHTRLKHLHRLHLKHLKHKLHLKHLHKLHKHJKHKJHKJHJKHKHJKHKHHLHLHLHKHKJHKJKKHKHKHKHKHHKHKHKHKHkhktryhtlhtklhtrkyhtrkyhtrkjyhtrkyhrekthtrkyhtrkhtrkyhtrkhtrkyhtrkhtrkyhtrkhtrkyhtrkhtrkyhtrkhtrkyhtrkhtrkyhtrkrtkyhtrklyhjrOEOHKDHFksdhfklHLHKHLHKKJHJHKGKLHLHJLJHLHLHLHLHHLHLHLHH";
//       String s = "welcometojava";	
		//String s = "ASDFHDSFHsdlfhsdlfLDFHSDLFHsdlfhsdlhkfsdlfLHDFLSDKFHsdfhsdlkfhsdlfhsLFDLSFHSDLFHsdkfhsdkfhsdkfhsdfhsdfjeaDFHSDLFHDFlajfsdlfhsdlfhDSLFHSDLFHdlfhs";
		
		int k =1;
		
		findMinAndMaxSubString(s, k);
	}

private static void findMinAndMaxSubString(String s, int k) {
	
	if(s== null || s.length()<k || k<=0)
	{
		System.out.println("invalid input");
		return;
	}
	
	//generate the sub string length k.........
	

	 String[] str = new String[s.length()];
	for(int i=0; i<=s.length()-k;i++)
	{
		str[i]= s.substring(i,i+k);
	}
	
	int size=0;
	for(String s1 : str)
	{
		if(s1!=null)
		{
			size++;
		}
	}
	
	String[] arr = new String[size];
	int index=0;
	for(int i=arr.length-1;i>=0;i--)
	{
	if(str[i]!=null)
	{
		arr[index]=str[i];
		index++;
	}
	}
	
//	Arrays.sort(arr);
	
	System.out.println(Arrays.toString(arr));
	
	for(int i=0;i<arr.length-1;i++)
	{
		for(int j=i+1;j<arr.length;j++)
		{
			if(arr[i].compareTo(arr[j])>0)
			{
				String temp = arr[i];
				arr[j] = arr[j];
				arr[j] = temp;
			}
		}
	}
	System.out.println(Arrays.toString(arr));
	
	
	
	System.out.println("smallest substring of length : " +arr[0]);
	System.out.println(" largest substring of length : " +arr[arr.length-1]);
	
}

}

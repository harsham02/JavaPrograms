package youtube31basic;

import java.util.Arrays;

public class arrayComparelargeSmallSecondDup {

	public static void main(String[] args) {

int[] arr1 = {12,6,21,12,45,365,45};
int[] arr2 = {7,4,2,8,12,45};

boolean res = Arrays.equals(arr1, arr2);

if(res==true)
{
	System.out.println("arrays are equals");	
}else {
	System.out.println("not equal");
}

int large =0;
int small =arr1[0];
int second =0;
for(int i=0;i<arr1.length;i++)
{
   if(arr1[i]>large)
   {
	   large = second;
	    large = arr1[i]; 
   }else if(arr1[i]>second && second!=large)
   {
	   second = arr1[i];
   }
   
   if(arr1[i] < small)
   {
	   small = arr1[i];
   }
}

System.out.println(large);
System.out.println(second);
System.out.println(small);

System.out.println(" duplicate elements in the Array are : ");
duplicateElements(arr1);

	}
	public static void duplicateElements(int[] arr1)
	{
	 
		for(int i=0;i<arr1.length;i++)
		{
		  for(int j=i+1;j<arr1.length;j++)
		  {
			  if(arr1[i]==arr1[j])
			  {
				 System.out.println(arr1[i]);
			  }
		  }
		}
	}
	
}

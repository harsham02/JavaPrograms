package java2blogs;

public class ArraySumIsClosestToXequalToX {

	public static void main(String[] args) {

//		Given a sorted array,we need to find a pair whose sum is closed to number X in Array.
//		 Find all pairs of elements from an array whose sum is equal to given number
 int array[]={-40,-5,1,3,6,7,8,20};
//The pair whose sum is closest to 5 :  1 and 3
 int x =27;
 closesttoX(array,x);
 equaltoX(array,x);
	}

	private static void equaltoX(int[] array, int x) {
   
		if(array.length<2)
		{
			return;
		}
		
		for(int i=0;i<array.length;i++)
		{
			for(int j=i+1; j<array.length;j++)
			{
				int tempSum = array[i] + array [j];
				
				if(tempSum == x)
				{
					System.out.println(array[i] +" "+ array[j]);
				}
			}
		}
	}

	private static void closesttoX(int[] array, int x) {

		if(array.length<2)
		{
			return;
		}
		
		int minSum = Math.abs(array[0] + array[1]-x);
		int index1st =0;
		int index2nd =1;
		
		for(int i=0;i<array.length;i++)
		{
			for(int j=i+1;j<array.length;j++)
			{
				int tempSum = Math.abs(array[i] + array [j]-x);
				
				if(tempSum < minSum)
				{
					index1st=i;
					index2nd = j;
					minSum = tempSum;
				}
			}
		}
		System.out.println(array[index1st]+" "+array[index2nd]);
	}

}

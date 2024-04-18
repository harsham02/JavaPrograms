package techWithJatin;

public class maxSumOFArray {

	public static void main(String[] args) {
		
		int a[]= {-1,4,-6,8};
		
		findMaxSum(a);
		
	}

	private static void findMaxSum(int[] a) {
		//currentSum = -1 // maxsum = -1;
		int currentSum = a[0];
		int maxSum = a[0];
		
		for(int i=1;i<a.length;i++)
		{
			//a[i] > -1 + 4  its true currentSum will be update
			if(a[i] > currentSum +a[i])
			{
			currentSum = a[i];
			}else{
				currentSum +=a[i];
			}
			// 4 > -1 = its true max sum will be update
			if(currentSum > maxSum)
			{
				maxSum = currentSum;
			}
		}
		
		System.out.println(maxSum);
	}

}

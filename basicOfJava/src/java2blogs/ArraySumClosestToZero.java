package java2blogs;

public class ArraySumClosestToZero {

	public static void main(String[] args) {
		
//		Find a Pair Whose Sum is Closest to zero in Array
 int	array[]={1,3,-5,7,8,20,-40,6};
//		The pair whose sum is closest to zero :  -5 and 6
		
		findPairWithMinSumBruteForce(array); 
	}

	private static void findPairWithMinSumBruteForce(int[] array) {

		if(array.length<2)
		{
			return;
		}
		int minimumSum = array[0] + array[1];
		int pair1stIndex = 0;
		int pair2ndIndex = 1;
		for (int i = 0; i < array.length; i++) {
	        for (int j = i+1; j < array.length; j++) {
	        	int tempSum = array[i] + array[j];
	        	if(Math.abs(tempSum) < Math.abs(minimumSum))
	        	{
	        		pair1stIndex = i;
	        		pair2ndIndex = j;	
	        		minimumSum = tempSum;
	        }
		}
	        }
		  System.out.println(" The pair whose sum is closest to zero : "+array[pair1stIndex]+" "+ array[pair2ndIndex]);
	}

}

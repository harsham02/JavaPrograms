package youtube31basic;

public class missingNumArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {7,5,6,1,4,2};
		
		int n= arr.length;
		
		int sum2 = ((n +1)* (n + 2)) /2;
		
		for(int i=0;i<arr.length;i++)
		{
			sum2 -=arr[i];
		}
		
		
		System.out.println("missing number is : "+sum2);
		
	}

}

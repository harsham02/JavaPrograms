package HackerRank;

public class billDivision {

	
	
	public static void main(String[] args) {
	
		int[] arr = {3,10,2,9};
		int k = arr[1];   //anna did't eat item.
		int b = 14;   //brian charged to anna.

		bonAppetit(arr, 10, b);
	}

	private static void bonAppetit(int[] arr, int k, int b) {
	
		int anna=k;
		int sum = 0;
		
		for(int i=0;i<arr.length;i++)
		{
			sum +=arr[i];   // total bill amount.
		}
		sum = sum -anna;
		int half = sum/2;
	
		if(b == half)
		{
			System.out.println("Bon Appetit");
		}else {
			int temp = half - b;
					
		   System.out.println(temp);
		}
		
		
	}

}

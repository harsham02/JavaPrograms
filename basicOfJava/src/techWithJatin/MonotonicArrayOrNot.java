package techWithJatin;

public class MonotonicArrayOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  // monotonic array means if its in asending or desending order it means array is monotonic if its not then array is not monotonic
	
//	int arr[] = {1,2,2,3};//monotonic
//	int arr[] = {6,5,4,4};// monotonic
	int arr[] = {1,3,2};  //not monotonic
	
	
	boolean res =check(arr);
	
	if(res==true)
	{
		System.out.println("yes");
	}else {
		System.out.println("no");
	}
	}

	 static boolean check(int[] arr) {
		 boolean inc=true;
		 boolean dec=true;
		for(int i=0;i<arr.length-1;i++)
		{
			if(arr[i] < arr[i+1])
			{
				dec = false;
			}else if(arr[i] > arr[i+1]){
				inc = false;
			}
		
		}
		return inc || dec;
	}

}

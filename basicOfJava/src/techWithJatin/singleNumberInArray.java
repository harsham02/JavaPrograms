package techWithJatin;

public class singleNumberInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {1,2,1,2,3,3,4,};
		
		int res=0;
		
		for(int i=0;i<arr.length;i++)
		{
			res = res ^ arr[i];
		}
		System.out.println(res);
	}

	
}

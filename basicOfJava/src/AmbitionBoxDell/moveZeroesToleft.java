package AmbitionBoxDell;

import java.util.Arrays;

public class moveZeroesToleft {

	public static void main(String[] args) {
		
		int[] arr = {1,1,0,2,0};
		
		moveZero(arr);
        moveZero1(arr);
	}

	private static void moveZero1(int[] arr) {

		 int left = 0; 
	     for(int i =0;i<arr.length;i++)
	     {
	    	   
	    		 if(arr[i]> arr[left])
	    		 {
	    			 int temp = arr[i];
	    			 arr[i] =arr[left];
	    			 arr[left] = temp;
	    			 left++;
	    		 }
	    	 
	     }
			System.out.println(Arrays.toString(arr));
		}

	private static void moveZero(int[] arr) {

     for(int i =0;i<arr.length;i++)
     {
    	 for(int j=0;j<arr.length;j++)
    	 {
    		 if(arr[i]< arr[j])
    		 {
    			 int temp = arr[i];
    			 arr[i] =arr[j];
    			 arr[j] = temp;
    		 }
    	 }
     }
		System.out.println(Arrays.toString(arr));
	}

}

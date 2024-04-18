package techWithJatin;

import java.util.Arrays;
import java.util.HashSet;

public class MissingNumberInArray {

	public static void main(String[] args) {

    int[] arr= {2,6,3,5,1,7};
    
    Arrays.sort(arr);
    
    HashSet<Integer> has = new HashSet<>();
    
    for(int i : arr)
    {
    	has.add(i);
    }
    
    for(int i=1;i<=arr.length+1;i++)
    {
    	if(!has.contains(i))
    	{
    		System.out.println(i);
    	}
    }

	}
 
}

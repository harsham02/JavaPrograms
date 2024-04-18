package HackerRank;

import java.util.HashMap;

public class migratoryBirds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {1, 2, 3, 4, 5, 4, 3, 2, 1, 3,4};
		
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
         
		for(int i=0;i<arr.length;i++)
		{
		    if(map.containsKey(arr[i]))
		    {
		    	map.put(arr[i], map.get(arr[i])+1);
		    }else {
		    	map.put(arr[i], 1);
		    }
		}
		int highFre=0;
		int res=0;
		for(Integer key : map.keySet())
		{
			if(map.get(key)>highFre)
			{
				highFre = map.get(key);
				res = key;
			}
		}
		System.out.println(res);
	}

}

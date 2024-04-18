package java2blogs;

import java.util.HashMap;
import java.util.Map;

public class numberoccuringOddNumOfTImes {
	int getOddTimesElement(int ar[]) 
    {
        int i;
        int result = 0;
        for (i = 0; i < ar.length; i++) 
        {
            // XOR operation
            result = result ^ ar[i];
        }
        return result;
    }
 

	public static void main(String[] args) {
		numberoccuringOddNumOfTImes occur = new numberoccuringOddNumOfTImes();
	
int array[] = new int[]{20, 40, 50, 40, 50, 20,50, 30, 30, 20, 40, 40, 20,20};

System.out.println(occur.getOddTimesElement(array));
HashMap<Integer,Integer> has = numOccure(array);
//
for(Map.Entry<Integer, Integer> map : has.entrySet())
{
	if(map.getValue()%2!=0) {
	System.out.println(map.getKey()+": " +map.getValue());
	}
}

//.................
for(int i=0;i<array.length;i++)
{
	int count =0;
	for(int j=0;j<array.length;j++) {
	if(array[i]==array[j])
	{
		count++;
		
	}
	
	}
	if(count%2!=0 )
	{
		System.out.println(array[i]+" "+ count);
		break;
		
	}
	

}

	}
	

	private static HashMap<Integer, Integer> numOccure(int[] array) {
		
		HashMap<Integer,Integer> has = new HashMap<Integer, Integer>();
		
		for(int i : array)
		{
			has.put(i, has.getOrDefault(i, 0)+1);
		}
		return has;
	}

}

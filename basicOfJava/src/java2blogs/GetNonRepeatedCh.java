package java2blogs;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class GetNonRepeatedCh {

	public static void main(String[] args) {

		String str ="harsha";
		
		HashMap<Character, Integer> has = new LinkedHashMap<Character, Integer>();
	
	for(Character ch : str.toCharArray())
	{
		
		has.put(ch, has.getOrDefault(ch, 0)+1);
	}
	
	for(Map.Entry<Character, Integer> map : has.entrySet())
	{
//		if(map.getValue()==1)
		{
			System.out.println(map.getKey()+" "+map.getValue());
		}
	}
	}

}

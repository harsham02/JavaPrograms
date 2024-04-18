package youtube31basic;

import java.util.HashMap;
import java.util.Map;

public class occurancesOfChinStringWords {

	public static void main(String[] args) {

	String str= "hello how mr harsha how are you, hello mr yuvi how are you too Happy to see you ";
	
	// occurrences of character............
	
	HashMap<Character, Integer> has = new HashMap<Character,Integer>();
	
	for(Character ch : str.toCharArray())
	{
		if(Character.isLetterOrDigit(ch))
		{
			has.put(ch, has.getOrDefault(ch, 0)+1);
		}
	}
	
	for(Map.Entry<Character, Integer> entry : has.entrySet())
	{
		System.out.println(entry.getKey()+" : "+entry.getValue());
	}
	
	//occurrences of words............
	
	HashMap<String, Integer> map = new HashMap<String, Integer>();
	
	String[] op = str.split(" "); 
	
	for(String s : op)
	{
		s= s.replaceAll("[^a-zA-Z]", "").toLowerCase();
		if(!s.isEmpty())
		{
			map.put(s, map.getOrDefault(s, 0)+1);
		}
	}
	
	System.out.println("occurrences of words ina string are : ");
	for(Map.Entry<String, Integer> entry : map.entrySet() )
	{
		System.out.println(entry.getKey()+": "+entry.getValue());
	}
	}
}

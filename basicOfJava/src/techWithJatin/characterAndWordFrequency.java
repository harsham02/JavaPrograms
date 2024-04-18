package techWithJatin;

import java.util.HashMap;
import java.util.Map;

public class characterAndWordFrequency {

	
	public static void main(String[] args) {
	
		//character frequency
	 HashMap<Character,Integer> map = new HashMap<>();
		String str = "harsha vardhana";
		str = str.toLowerCase();
		
	  char[] ch = str.toCharArray();
	  
	  for(char c : ch)
	  {
		  if(Character.isLetter(c))
		  {
			  map.put(c, map.getOrDefault(c, 0)+1);
		  }
	
	  }
	  int value=0;
	  char key ='.';
	 for(Map.Entry<Character, Integer> has : map.entrySet())
	 {
		 
		 System.out.println(has.getKey()+" "+has.getValue());
		  
		if( value < has.getValue())
		{
			value = has.getValue();
			key = has.getKey();
		}
		 
	 }
	 System.out.println(key +" : "+value);
	 
	 
	 //word frequnecy...
	 
	 String sentence = "hello my name is Harsha and it is my program is about to Frequency of words";
	 
	 String[] words = sentence.split(" ");
	 
	 HashMap<String, Integer> hass = new HashMap<>();
	 
	 for(String st : words)
	 {
		 st = st.replaceAll("[^a-zA-Z]", "").toLowerCase();
		 
		 hass.put(st,hass.getOrDefault(st, 0)+1 );
	 }
	 System.out.println();
	 
	 int value1 =0;
	 String keyy = "";
	 for(Map.Entry<String, Integer> mapp : hass.entrySet())
	 {
		 System.out.println(mapp.getKey()+ " : "+mapp.getValue());
		 
		 if(mapp.getValue() > value1)
		 {
			 value1 = mapp.getValue();
			 keyy = mapp.getKey();
		 }
	 }
	 System.out.println("heighest frequency of word is = "+keyy+ " : "+value1);
	
	}

}

package java2blogs;

import java.util.HashMap;
import java.util.Map;

public class hackerRankFail {
		// Function to convert double, triple, quad etc
		// into 2, 3, 4 etc respectively
	
	private static final Map<String ,Character> map = new HashMap<>();
	
	static { 
		map.put("one", '1');
		map.put("two", '2');
		map.put("zero", '0');
		map.put("three", '3');
		map.put("four", '4');
		map.put("five", '5');
		map.put("six", '6');
		map.put("seven", '7');
		map.put("eight", '8');
		map.put("nine", '9');
	}
		public static int prefixFreq(String word)
		{
			if(word.equals("double"))
				return 2;
			else if (word.equals("triple"))
				return 3;
			else if (word.equals("quad"))
				return 4;
			else if (word.equals("penta"))
				return 5;
			else if (word.equals("hexa"))
				return 6;
			else if (word.equals("hepta"))
				return 7;
			else if (word.equals("octa"))
				return 8;
			else if (word.equals("nona"))
				return 9;
			else if (word.equals("deca"))
				return 10;

			return -1;
		}

		// Function to convert zero, one, two etc
		// into 0, 1, 2 respectively
//		public static char strTOnum(String word)
//		{
//			if (word.equals("zero"))
//				return '0';
//			else if (word.equals("one"))
//				return '1';
//			else if (word.equals("two"))
//				return '2';
//			else if (word.equals("three"))
//				return '3';
//			else if (word.equals("four"))
//				return '4';
//			else if (word.equals("five"))
//				return '5';
//			else if (word.equals("six"))
//				return '6';
//			else if (word.equals("seven"))
//				return '7';
//			else if (word.equals("eight"))
//				return '8';
//			else if (word.equals("nine"))
//				return '9';
//
//			return (char)-1;
//		}

		// Function to extract the number from string
		public static String TextToNum(String text)
		{

	          
			String[] ip = text.split(" ");
			String res =""; 
			int digit;
			
			for(int i=0;i<ip.length;i++)
			{
			 digit =  prefixFreq(ip[i]);
			 
			 if(digit== -1)
			 {
				 res+= map.get(ip[i]);
			 }else {
				 for( int j=0 ;j<digit;j++)
				 res+= map.get(ip[i+1]);
				 i++;
			 }
			}
		return res;
		}

		// Driver code
		public static void main(String[] args)
		{
			String s = "five eight double two double two four triple eight";
			System.out.println(TextToNum(s));
//			  String s4 ="five one zero two four eight zero double three two"; 
//			    System.out.println(TextToNum(s4));
//			    
//			    String  s1= "five one zero six triple eight nine six four";
//			    System.out.println(TextToNum(s1));
			    
			    
			    String  s2= "five eight double six double two four eight five six six ";
			    System.out.println(TextToNum(s2));
			    
			    String str1 = "nine double zero five seven eight seven double six";
			    
			    System.out.println(TextToNum(str1));
		}
	}

	// This code is contributed by kaalel.



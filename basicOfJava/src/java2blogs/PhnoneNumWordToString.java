package java2blogs;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class PhnoneNumWordToString {

	

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
	
	String str = "two one nine six eight one six four six zero";
  
  
    System.out.println(wordToNum(str));
    
    String s ="five one zero two four eight zero double three two"; 
    System.out.println(wordToNum(s));
    
    String  s1= "five one zero six trible eight nine six four";
    System.out.println(wordToNum(s1));
    
    
    String  s2= "five eight double two double two four eight five six six ";
    System.out.println(wordToNum(s2));
	}

	private static String wordToNum(String str) {
	
	List<String> list = Arrays.asList(str.split(" "));
	
	String res="";
	int digit;
	
	for(int i=0;i<list.size();i++)
	{
		digit = prefixFre(list.get(i).toLowerCase());
		
		if(digit == -1)
		{
			res+= txtToNum(list.get(i).toLowerCase());
		}else {
			
			for(int j =0 ;j<digit; j++)
			res+= txtToNum(list.get( i + 1).toLowerCase());
			i++;
		}
		
	}
		return res;
	}

	private static char txtToNum(String string) {
		
		if(string.equals("one"))
		{
			return '1';
		}else if(string.equals("two"))
		{
			return '2';
		}else if(string.equals("three"))
		{
			return '3';
		}else if(string.equals("four"))
	  {
		return '4';
	  }else if(string.equals("five"))
		{
			return '5';
		}else if(string.equals("six"))
		{
			return '6';
		}else if(string.equals("seven"))
	    {
		   return '7';
	    }
		else if(string.equals("eight"))
		{
			return '8';
		}else if(string.equals("nine"))
		{
			return '9';
		}else if(string.contains("zero"))
		{
			return '0';
		}
		return (char) -1;
	}

	private static int prefixFre(String string) {
		
	 if(string.contains("double"))
	 {
		 return 2;
	 }else if(string.contains("trible"))
	 {
		 return 3;
	 }
	 return -1;
	}

	

}

package java2blogs;

import java.util.Arrays;

public class AnagramsAndLength {

	public static void main(String[] args) {

		String str1= "race";
		String str2 = "care";
		
		// length without inbuilt method........
		char[] c  = str1.toCharArray();
		int len=0;
		for(Character cha : c)
		{
		len++;	
		}
		
		System.out.println(len);
		
		//anagrams....................
		String sort1 = sortString(str1);
		String sort2 = sortString(str2);
		
		System.out.println(sort1);
		System.out.println(sort2);
		
		boolean res = sort1.equals(sort2);
		
		if(str1.length()==str2.length())
		{
			if(res)
			{
				System.out.println(str1+" and "+str2+ " are Anagrams");
			}else {
				System.out.println(str1+" and "+str2+ " are not Anagrams");
			}
		}else 
			{
				System.out.println("length of strings are not matched so its not Anagrams");
			}
		
	}

	private static String sortString(String str1) {
       String op ="";
       
      char[] ch = str1.toCharArray();
      
    for(int i=0;i<ch.length;i++)
    {
    	for(int j=i+1;j<ch.length;j++)
    	{
    		if(ch[i]>ch[j])
    		{
    		  char temp = ch[i];
    		  ch[i] =  ch[j];
    		  ch[j]= temp;
    		}
    	}
    }
    
    for(int i=0;i<ch.length;i++)
    {
      op+=ch[i];
    }
        
       return op;
	}
	}



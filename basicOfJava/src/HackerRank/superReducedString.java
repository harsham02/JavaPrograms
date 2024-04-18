package HackerRank;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class superReducedString {
	
	
	private static String superReducedString(String s) {
		
		boolean changed;
		do {
			 changed = false;
			 
			 for(int i=0;i<s.length();i++)
			 {
				if(i==s.length()-1)
					continue;
				if(s.charAt(i)== s.charAt(i+1))
				{
					changed = true;
					s = s.substring(0,i) + s.substring(i+2);
				}
			 }
		}while(changed);
		
		if(s.equals(""))
		{
			return "Empty String";
		}else {
			return s;
		}
	
	}
	public static void main(String[] args) throws IOException {

     
        String s = "babb";

     System.out.println(superReducedString(s));
	}
}

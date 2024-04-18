package HackerRank;

import java.util.ArrayList;
import java.util.List;

public class camelCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
         String s ="harshaVardhanaMurthy";
        int count=0;
        List<String> str = new ArrayList<String>();
        String st = "";    
        for(Character c : s.toCharArray())
        {    
            if(Character.isLetter(c)){
                st+=c;
                if(Character.isUpperCase(c))
                {
                  st +=" ";
                }
            }
               
        }
        System.out.println(st);
	}

}

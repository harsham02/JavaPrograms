package techWithJatin;

import java.util.LinkedHashSet;
import java.util.Set;

public class removeDuplicateChar {
    //remove duplicate char from array
	// using linkedHashset for need to preserve oder
	public static void main(String[] args) {
		
		String str = "java";
		char[] ch = str.toCharArray();
		
		Set<Character> set = new LinkedHashSet<Character>();
		
		for(char c : ch)
		{
			set.add(c);
		}
		
		System.out.println(set.toString());

	}

}

package AmbitionBoxDell;

import java.util.ArrayList;
import java.util.List;

public class StringToNumPratian {

	public static void main(String[] args) {


		String str ="abhi harshA Vardhna M ";
		
		List<Integer> list = new ArrayList<Integer>();
		
		for(char ch : str.toCharArray())
		{
			if(Character.isSpace(ch)) {
					list.add(99);
			}else if(ch >= 'a' && ch <='z')
			{
				list.add((ch) - 96);
			}
			else if(ch >='A' && ch <='Z')
			{
				list.add((ch) - 38);
			}else {
				list.add(00);
			}
		}
		
		System.out.println(list.toString());

	}

}

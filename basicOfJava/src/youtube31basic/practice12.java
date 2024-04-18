package youtube31basic;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class practice12 {

	public static void main(String[] args)
	{
		Stack<Integer> st = new Stack<>();
		
		st.add(23);
		st.add(34);
		st.add(28);
		st.add(89);
		st.pop();
		st.add(567);
		
	  Map<Integer,String>  m = new HashMap<>();
		
		m.put(23, "harsha");
		m.put(24, "ash");
		m.put(21, "harsha");
		m.put(24, "ash");
		m.put(26, "harsha");
		m.put(24, "ash");
		
		m.forEach( (k,v) -> {
			System.out.println(k+" "+v);
			}
		);
	}
}

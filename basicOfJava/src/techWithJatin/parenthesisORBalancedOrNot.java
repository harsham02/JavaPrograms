package techWithJatin;

import java.util.Stack;

public class parenthesisORBalancedOrNot {

	public static void main(String[] args) {

String str = "{[()]}";

String s = checkBalance(str);
System.out.println(s);
	}
	
	public static  String checkBalance(String s)
	{
		char[] ch = s.toCharArray();
		
		Stack<Character> stack = new Stack<>();
		
		for(char c : ch)
		{
			if(c == '{' || c== '[' || c== '(')
			{
				stack.push(c);
			}
			else {
				if(stack.isEmpty() ||!isMatchPair(stack.pop(),c))
				{
					return "no";
				}
			}
		}
		
		return stack.isEmpty() ? "yes" : "no";
	}
	static boolean isMatchPair(char open, char close)
	{
		return (open == '(' && close == ')') ||
			   (open == '[' && close == ']') ||
			   (open == '{' && close == '}');
		
	}

}

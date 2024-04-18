package youtube31basic;

public class revserseEachWordInString {

	public static void main(String[] args) {

		String  str= "Hello world this is a a sample String";
		
		String op[] = str.split(" ");
		
		for(String s : op)
		{
			
			String rev ="";
			for(int i=0;i<s.length();i++)
			{
				char ch = s.charAt(i);
			   rev =  ch + rev; 	
			}
			
			System.out.print(rev+" ");
		}
	}

}

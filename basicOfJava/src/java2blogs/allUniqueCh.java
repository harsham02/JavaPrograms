package java2blogs;

public class allUniqueCh {

	public static void main(String[] args) {

		String str ="ab12cd";
	boolean res = allUnique(str);
	
	if(res)
	{
		System.out.println("String contains all unique character");
	}else {
		System.out.println("String doesn't contain unique character");
	}
	}

	private static boolean allUnique(String str) {
		
		
		for(int i=0;i<str.length();i++)
		{
			for(int j=i+1;j<str.length();j++)
			{
		     
				if(str.charAt(i)==str.charAt(j))
				{
					return false;
				}
			}
		}
		return true;
	}
	
	

}

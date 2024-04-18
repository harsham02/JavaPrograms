package techWithJatin;

public class panagram {

	public static void main(String[] args) {
		
		//panagram means the string contains all the alphabets from a to z or A to Z ignoring the case sensitivity..
		
	// Pack MY box with five dozen liquor jugs.
		// The quick brown fox jumps over the lazy dog.
		
		String str = "Pack MY box with five dozen liquor jugs";
		
	    str = str.toLowerCase();
	  System.out.println(panaGram(str));
	}

	public static boolean panaGram(String str)
	{
		if(str.length()<26)
		{
			return false;
		}else {
			
			for(char i = 'a'; i <='z';i++)
			{
				if(str.indexOf(i)<0)
				{
					return false;
				}
			}
			return true;
		}
	
	}


}

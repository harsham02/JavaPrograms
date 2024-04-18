package java2blogs;

public class OneStringIsRotationOfAnotherString {

	public static void main(String[] args) {

		String str1 = "java2blog";
		String str2 = "blogjava2";
		
		
		System.out.println(str1+" and "+str2+ " is rotation of each other : "+isRotation(str1,str2));
	}

	private static boolean isRotation(String str1, String str2) {
	
		String str3 = str1 + str1;
		
		if(str3.contains(str2))
		{
			return true;
		}
		return false;
	}

}

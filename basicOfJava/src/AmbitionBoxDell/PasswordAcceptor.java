package AmbitionBoxDell;

import java.util.Scanner;

public class PasswordAcceptor {

	public static void main(String[] args) {

//		– At least 4 characters.
//		– At least one numeric digit.
//		– At Least one Capital Letter.
//		– Must not have space or slash (/).
//		– Starting character must not be a number.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("please enter a password to check its valid or not: ");
		String str = sc.next();
		
		if(isLength(str) && oneNumaricDigit(str) && oneCapitalLetter(str) && notSpace(str) && startCharNotNum(str))
		{
			System.out.println("The password "+str+" is valid ");
		}else {
		System.out.println("not valid ");
		}

	}

	private static boolean startCharNotNum(String str) {
		boolean valid=false;
		char[] ch = str.toCharArray();
		
		if(!Character.isDigit(ch[0]))
		{
			valid = true;
		}
		return valid;
	}

	private static boolean notSpace(String str) {
		
		boolean valid = false;
	
			if(!str.contains(" ") || !str.contains("/"))
			{
				valid = true;
			}
	
		return valid;
		
	}

	private static boolean oneCapitalLetter(String str) {
    boolean valid = false;
		for(int i=0;i<str.length();i++)
		{
			char ch = str.charAt(i);
			if(Character.isUpperCase(ch))
			{
				valid = true;
			}
		}
		return valid;
	
	}

	private static boolean oneNumaricDigit(String str) {
		boolean valid = false; 
		
		for(int i=0;i<str.length();i++)
		{
			char ch = str.charAt(i);
			if(Character.isDigit(ch))
			{
				valid = true;
			}
			
		}
		return valid;

	}

	private static boolean isLength(String str) {
		
		if(str.length()<=0)
		{
			return false;
		}else {
			return true;
		}
	
	}

}

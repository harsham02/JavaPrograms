package HackerRank;

public class removeTagBasedLanguage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String s ="<h1>Nayeem loves counseling</h1>\r\n"
				+ "<h1><h1>Sanjay has no watch</h1></h1><par>So wait for a while</par>\r\n"
				+ "<Amee>safat codes like a ninja</amee>\r\n"
				+ "<SA premium>Imtiaz has a secret crush</SA premium>";
	
		String str= s.replaceAll("<h1>", "");
		str = str.replaceAll("<SA premium>", "");
		str = str.replaceAll("</h1>", "");
		str = str.replaceAll("</SA premium>", "");
		str = str.replaceAll("<par>", "");
		str = str.replaceAll("</par>", "");
		str = str.replaceAll("</amee>", "none");
		str = str.replaceAll("<Amee>", "\n");
		System.out.println(str);
		
		
		
	}

}

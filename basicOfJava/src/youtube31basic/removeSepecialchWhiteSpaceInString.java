package youtube31basic;

public class removeSepecialchWhiteSpaceInString {

	public static void main(String[] args) {

	String str =" harsha vardhana  Murthy";
	
// using replaceAll 
	
//    str = str.replaceAll("\\s", "");
//    
//    System.out.println(str);

	// using character isWhitespace
    String op = "";
    
    for(int i=0;i<str.length();i++)
    {
    	char ch = str.charAt(i);
    	
    	if(!Character.isWhitespace(ch))
    	{
    		op +=ch;
    	}
    }
    System.out.println(op);
    
    // remove junk and special characters in string
    //using replace all......
    
    String s = "wyeg2 @*7ue2fuvew !~\1[e23vbiber 3421)&*(&&0987654";
    
    s = s.replaceAll("[^a-zA-Z0-9]", "");
    
    System.out.println(s);
    
    //using for loop
    
    String res="";
    
    for(int i=0; i<s.length();i++)
    {
    	char ch = s.charAt(i);
    	if(ch > 20 && ch <122)
    	{
    		res =res +  ch;
    	}
    }
    System.out.println(res);
	}

}

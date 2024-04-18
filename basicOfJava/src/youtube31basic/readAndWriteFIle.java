package youtube31basic;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class readAndWriteFIle {

	public static void main(String[] args) throws IOException {

	File file = new File("sample.txt");
	
	String str ="Hello! how are you harsha........";
	
	FileOutputStream fp = new FileOutputStream(file);
		
	for(int i=0;i<str.length();i++)
	{
	   fp.write(str.charAt(i));
	}
	
	System.out.println("writting data into file is successful");
	fp.close();
	
	String op = readFile(file);
	
	System.out.println("reading data from file");
	System.out.println(op);
	
	file.delete();
	}

	private static String readFile(File file) throws IOException {
		String op="";
		
		int ch;
		FileInputStream fp= null;
		
		try {
			fp = new FileInputStream(file);
			
		}catch(FileNotFoundException e)
		{
			e.getMessage();
		}
		
		while((ch = fp.read())!=-1)
		{
			op+=(char) ch;
		}
		return op;
	}
}

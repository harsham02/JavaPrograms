package java2blogs;

public class StringPermutations {

	public static void main(String[] args) {
    
		String input = "abc";
		generatePermutations(input, 0);
	}

	private static void generatePermutations(String input, int index) {

		//base case if we have reached the end of the string , print the permutations...
		if(index==input.length()-1)
		{
			System.out.println(input);
			return;
		}
	
		//recursively generate permutations by swapping characters at different positions....
		
			for(int i=index; i<input.length();i++)
			{
				input = swap(input,index,i);// swap the character at index and i
				generatePermutations(input, index+1);// recursively generate permutations for the rest of the string..
			  input = swap(input,index,i);  // restore the string to its original state.
			}
		
		
	}

	private static String swap(String input, int i, int j) {
		
		char[] charArray = input.toCharArray();
		char temp = charArray[i];
		charArray[i] = charArray[j];
		charArray[j] = temp;
		return new String(charArray);
	}

}

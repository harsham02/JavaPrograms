package techWithJatin;

public class findEvenLetterWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "sky is blue and vast";
		
		String[] s = str.split(" ");
		
		for(String st : s)
		{
			if(st.length()%2==0)
			{
				System.out.println(st);
			}
		}
	}

}

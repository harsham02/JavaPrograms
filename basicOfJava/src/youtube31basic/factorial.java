package youtube31basic;

public class factorial {

	public static void main(String[] args) {

		int n=4, res=1;
		
		for(int i=1; i<=n;i++)
		{
			res *=i;
		}
		System.out.println("the factorial of number "+n+ " is : "+res);
	}

	
}

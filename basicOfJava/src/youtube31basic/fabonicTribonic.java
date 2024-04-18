package youtube31basic;
import java.util.*;
public class fabonicTribonic {

	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	
	int[] arr = new int[100];
	System.out.println("the fibonic series are : ");
	
	int a=0, b=1, res=0;
	for(int i=0; i<arr.length;i++)
	{
	    arr[i] = res;
	   res = a+b;
	   a=b;
	   b=res;
	}
	
	System.out.println(Arrays.toString(arr));
	
tribonic();
	
	
	}
	
	public static void tribonic()
	{

		int[] arr = new int[100];
		System.out.println("the tribonic series are : ");
		
		int a=0, b=1, c=1, res=0;
		for(int i=0; i<arr.length;i++)
		{
		    arr[i] = res;
		   res = a+b+c;
		   a=b;
		   b=c;
		   c=res;
		}
		System.out.println(Arrays.toString(arr));
	}
}

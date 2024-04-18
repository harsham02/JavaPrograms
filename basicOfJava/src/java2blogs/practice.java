package java2blogs;

import java.util.HashSet;
import java.util.Set;

public class practice {

	public static void main(String[] args)
	{
		
		String ip = "abc";
		
		
		permutations(ip,0);
		
		
		for(int i =0; i<1000;i++)
		{
			if(isHappyNumer(i))
			{
				System.out.println(i);
			}
		}
	}

	private static boolean isHappyNumer(int n) {

		Set<Integer> has = new HashSet<>();
		while(n!=1 && !has.contains(n))
		{
			has.add(n);
			
			n = getNext(n);
		}
		return n ==1;
	}

	private static int getNext(int n) {
		
		int res=0;
		
		while(n!=0)
		{
			int r = n % 10;
			res+=Math.pow(r, 2);
			n/=10;
		}
		
		return res;
	}

	private static void permutations(String ip, int i) {
		
		if( i == ip.length())
		{
			System.out.println(ip);
			
		}
		
		for(int index = i; index < ip.length();index++)
		{
			ip = swap(ip,i,index);
			permutations(ip,i+1);
			ip = swap(ip,i,index);
		}
	}

	private static String swap(String ip, int i, int index) {
	
		char[] ch = ip.toCharArray();
		
		char temp = ch[i];
		ch[i] = ch[index];
		ch[index] = temp;
		return new String(ch);
	}
	
}

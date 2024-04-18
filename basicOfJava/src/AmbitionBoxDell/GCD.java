package AmbitionBoxDell;

import java.util.Scanner;

public class GCD {

	public static void main(String[] args) {
		// TODO Auto-generated method 

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println(gcd(a,b));

	}

	private static int gcd(int a, int b) {
		
		while(b!=0)
		{
			int temp = b;
			
			b = a%b;
		a = temp;
		}
		return a;
	}

}

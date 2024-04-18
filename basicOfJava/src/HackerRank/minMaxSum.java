package HackerRank;

import java.util.ArrayList;
import java.util.List;

public class minMaxSum {
//	// Write your code here
//    Long sum=0l, max=Long.MIN_VALUE, min=Long.MAX_VALUE;
//    for(int a : arr){
//        sum += a;
//        if(a > max) max = (long)a;
//        if(a < min) min = (long)a;
//    }
//    
//    System.out.println((sum - max) + " " + (sum - min));

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	1 2 3 4 5
		List<Integer> l = new ArrayList<Integer>();
		List<Integer> l2 = new ArrayList<>();
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(4);
		l.add(5);
		
		
		int sum=0;
		int size=0;
		
		for(Integer i : l)
		{
			sum+= l.get(i);
		}
		
   l2.add(sum);
   
   System.out.println(l);
	}

}

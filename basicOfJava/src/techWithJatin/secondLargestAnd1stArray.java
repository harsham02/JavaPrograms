package techWithJatin;

public class secondLargestAnd1stArray {

	// first largest, second largest and third largest...
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] salary = {2000,21121,44000,32000,11300};
		
		int secondLargest =salary[0];
		int firstLargest =salary[0];
		int thirdLargest = salary[0];
		
		for(Integer sal : salary)
		{
			if(sal >  firstLargest)
			{
				secondLargest = firstLargest;
				 firstLargest = sal;
			}else if(sal > secondLargest && secondLargest != firstLargest)
			{
				thirdLargest = secondLargest;
				secondLargest = sal; 
			}else if(sal > thirdLargest && thirdLargest!= secondLargest && thirdLargest!= firstLargest)
			{
				thirdLargest = sal;
			}
		}
		System.out.println(firstLargest);
		System.out.println(secondLargest);
	    System.out.println(thirdLargest);
	    System.out.println();
	    // first, second, third smallest....
	    
    int firstSmallest = salary[0];
    int secondSmallest = Integer.MAX_VALUE;
    int thirdSmallest =Integer.MAX_VALUE;
    
    for(int sal : salary)
    {
    	if(sal < firstSmallest)
    	{
    		secondSmallest = firstSmallest;
    		 firstSmallest = sal;
    	}
    }
    //second smallest number
    for(int sal : salary)
    {
    	if(sal != firstSmallest && sal < secondSmallest)
    	{
    		secondSmallest = sal;
    	}
    }
    for(int sal : salary)
    {
    	if(sal != firstSmallest && sal!= secondSmallest  && sal < thirdSmallest)
    	{
    		thirdSmallest = sal;
    	}
    }
    System.out.println(firstSmallest);
    System.out.println(secondSmallest);
    System.out.println(thirdSmallest);

	}

}

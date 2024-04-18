package java2blogs;

public class MergeSort {

	public static void main(String[] args) {

		 int[] arr = {2,32,12,12,43,45,56};
		 
		 int first =0;
		 int last = arr.length-1;
		 mergeSort(arr,first,last);
		 for(int i : arr)
		 {
			System.out.println(arr); 
		 }
	}

	private static void mergeSort(int[] arr, int first, int last) {
  
		if(first < last)
		{
			int mid = (first + last) / 2;
			mergeSort(arr,first,mid);
			mergeSort(arr,mid+1,last);
			merge(arr,first,mid,last);
			
		}
	}

	private static void merge(int[] arr, int first, int mid, int last) {


		int i = first;
		int j = mid+1;
		int k = first;
		
		int[] b = new int[arr.length];
		while(i<=mid && j<=last)
		{
			if(arr[i] < arr[j])
			{
				b[k] = arr[i];
				i++;
				k++;
			}else {
				b[k] =arr[j];
				j++;k++;
				
			}
		}
		while(i<=mid)
		{
			b[k] = arr[i];
			i++;
			k++;
		}
		
		while(i<=last)
		{
			b[k] = arr[j];
			j++;
			k++;
		}
	
		for(i=first;i<=last;i++)
		{
			arr[i]=b[i];
		}
	}

}

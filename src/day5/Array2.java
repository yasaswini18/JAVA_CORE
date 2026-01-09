package day5;

/*
 * WAJP to print occurrence of each element without using Map.
 * WAJP to find unique elements from array without using Collection and Map.
 * WAJP to find duplicates(Which occurs more than 1) from array without using Collection
and Map.
 */
public class Array2 {
	public static void main(String[] args) 
	{
		int[] arr = {1,2,3,4,1,2,2,3};
		
		occurrence(arr);
		uniqueElements(arr);
		duplicateElements(arr);
	}
	public static void occurrence(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{	int count=1;
				for(int j=1;j<arr.length;j++)
				{
					if(arr[i]==arr[j])
					{
						count++;
					}
				}
				System.out.println("occurrence of "+arr[i]+" is "+count);
			}		
		System.out.println();
	}
	public static void uniqueElements(int arr[]) 
	{
		System.out.println("Unique elements");
		for(int i=0;i<arr.length;i++)
		{	int count=0;
				for(int j=0;j<arr.length;j++)
				{
					if(arr[i]==arr[j])
					{
						count++;
					}
				}
				if(count==1) System.out.print(arr[i]+" ");
			}	
	}
	public static void duplicateElements(int arr[])
	{
		System.out.println("duplicate elements are");
		for(int i=0;i<arr.length;i++)
		{
			int count=0;
			for(int j : arr)
			{
				if(arr[i]==j)
				{
					count++;
				}
			}
			
			boolean alreadyPrinted = false;
			for(int k=0;k<i;k++)
			{
				if(arr[k]==arr[i]) alreadyPrinted=true;
			}
			if(count!=1 && !alreadyPrinted) System.out.print(arr[i]+" ");
			
		}
	}
	

}



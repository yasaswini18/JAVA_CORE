package day5;

/*
 * WAP to merge two array without collection
 * WAP to find union of two array without collection
 * WAP to find intersection of two array without collection
 */
public class Array1 {
	public static void main(String[] args)
	{
		int arr1[] = {1,2,3,4};
		int arr2[] = {1,2,3,4,5,6};
		merge(arr1,arr2);
		union(arr1,arr2);
		intersection(arr1, arr2);
	}
	public static void merge(int arr1[],int arr2[])
	{
		int arr3[] = new int[arr1.length+arr2.length];
		int n = 0;
		for(int i : arr1)
		{
			arr3[n++]=i;
		}
		for(int i : arr2)
		{
			arr3[n++]=i;
		}
		
		System.out.println("Merged array is : ");
		for(int i : arr3)
		{
			System.out.print(i+" ");
		}
		System.out.println();
	}
	public static void union(int arr1[] , int arr2[])
	{
		int arr3[] = new int[arr1.length+arr2.length];
		int n=0;
		for(int i : arr1)
		{
			arr3[n]=i;
			n++;
		}
		for(int i : arr2)
		{
			boolean isFound = false;
			for(int j : arr3)
			{
				if(i==j)
				{
					isFound=true;
					break;
				}
			}
			if(!isFound)
			{
				arr3[n++]=i;
			}
		}
		System.out.println("Union of two array is : ");
		for(int i=0;i<n;i++)
		{
			System.out.print(arr3[i]+" ");
		}
		System.out.println();
	}
	public static void intersection(int[] arr1,int[] arr2)
	{
		int[] arr3 = new int[arr1.length+arr2.length];
		int n=0;
		for(int i : arr1)
		{
			boolean isFound = false;
			for(int j : arr2)
			{
				if(i==j) 
					{isFound=true;
					break;
					}
			}
			if(isFound)
			{
				arr3[n++]=i;
			}
		}
		System.out.println("Intersection of two array is : ");
		for(int i=0;i<n;i++)
		{
			System.out.print(arr3[i]+" ");
		}
		
	}
	

}

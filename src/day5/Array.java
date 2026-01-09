package day5;

import java.util.Scanner;

/*
 * WAP to print even elements from the given array
 * WAP to print prime elements from the given array
 * WAP to print perfect(perfect number elements from the given array
 * WAP to print sum of elements from the given array
 * WAP to print product of elements from the given array
 * WAP to find smallest element without sorting
 * WAP to find largest element without sorting
 * WAP to find second smallest element without sorting
 * WAP to find second largest element without sorting
 * WAP to find third smallest element without sorting
 * WAP to find third largest element without sorting
 */
public class Array {
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of array: ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<arr.length;i++)
		{
			System.out.print("Enter the value at index "+i+" : ");
			arr[i]=sc.nextInt();
		}
		
		evenElements(arr);
		primeElements(arr);
		pefectElements(arr);
		sumOfElements(arr);
		productOfElements(arr);
		smallestElement(arr);
		secondSmallestElement(arr);
		thirdSmallestElement(arr);
		largestElement(arr);
		secondLargestElement(arr);
		thirdLargestElement(arr);
		
		sc.close();
	}
	
	public static void evenElements(int[] arr)
	{
		System.out.println("even elements are ");
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	public static void primeElements(int[] arr)
	{
		System.out.println("prime elements are ");
		for(int i=0;i<arr.length;i++)
		{
			int count=0;
			for(int j=1;j<=arr[i];j++)
			{
				if(arr[i]%j==0)
					count++;
			}
			if(count==2)System.out.print(arr[i]+" ");
			
		}
		System.out.println();
	}
	public static void pefectElements(int[] arr)
	{
		System.out.println("perfect elements are ");
		for(int i=0;i<arr.length;i++)
		{
			int sum=0;
			for(int j=1;j<arr[i];j++)
			{
				if(arr[i]%j==0)
					sum+=j;
			}
			if(sum==arr[i])System.out.print(arr[i]+" ");
			
		}
		System.out.println();
	}
	public static void sumOfElements(int[] arr)
	{
		System.out.println("sum of all elements is ");
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
					sum+=arr[i];
		}
		System.out.print(sum);
		System.out.println();
	}
	public static void productOfElements(int[] arr)
	{
		System.out.println("product of all elements is ");
		int product=1;
		for(int i=0;i<arr.length;i++)
		{
					product*=arr[i];
		}
		System.out.print(product);
		System.out.println();
	}
	public static void smallestElement(int[] arr)
	{
		System.out.println("smallest of all elements is ");
		int smallest=Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<smallest)
				smallest=arr[i];
		}
		System.out.print(smallest);
		System.out.println();
	}
	public static void largestElement(int[] arr)
	{
		System.out.println("largest of all elements is ");
		int largest=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>largest)
				largest=arr[i];
		}
		System.out.print(largest);
		System.out.println();
	}
	public static void secondSmallestElement(int[] arr)
	{
		System.out.println("Second smallest of all elements is ");
		int smallest=Integer.MAX_VALUE;
		int secondSmallest = Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<smallest)
			{
				secondSmallest = smallest;
				smallest=arr[i];
			}
			else if(arr[i]<secondSmallest)
				secondSmallest=arr[i];
				
		}
		System.out.print(secondSmallest);
		System.out.println();
	}
	public static void secondLargestElement(int[] arr)
	{
		System.out.println("Second largest of all elements is ");
		int largest=Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>largest)
			{
				secondLargest=largest;
				largest = arr[i];
			}
			else if(arr[i]>secondLargest)
				secondLargest=arr[i];
				
		}
		System.out.print(secondLargest);
		System.out.println();
	}
	public static void thirdSmallestElement(int[] arr)
	{
		System.out.println("Third smallest of all elements is ");
		int smallest=Integer.MAX_VALUE;
		int secondSmallest = Integer.MAX_VALUE;
		int thirdSmallest = Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<smallest)
			{
				thirdSmallest = secondSmallest;
				secondSmallest = smallest;
				smallest=arr[i];
			}
			else if(arr[i]<secondSmallest && arr[i]<thirdSmallest)
			{
				thirdSmallest=secondSmallest;
				secondSmallest=arr[i];
			}else if(arr[i]>secondSmallest && arr[i]<thirdSmallest)
			{
				thirdSmallest=arr[i];
			}
				
		}
		System.out.print(thirdSmallest);
		System.out.println();
	}
	public static void thirdLargestElement(int[] arr)
	{
		System.out.println("Third largest of all elements is ");
		int largest=Integer.MIN_VALUE;
		int secondlargest = Integer.MIN_VALUE;
		int thirdlargest = Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>largest && arr[i]>secondlargest)
			{
				thirdlargest = secondlargest;
				secondlargest = largest;
				largest=arr[i];
			}
			else if(arr[i]>secondlargest && arr[i]>thirdlargest)
			{
				thirdlargest=secondlargest;
				secondlargest=arr[i];
			}else if(arr[i]<secondlargest && arr[i]>thirdlargest)
			{
				thirdlargest=arr[i];
			}
				
		}
		System.out.print(thirdlargest);
		System.out.println();
	}
	
	
	
	
	
	
}

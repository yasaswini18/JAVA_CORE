package day5;

import java.util.Scanner;

/*
 * Given an integer array nums, return an array answer such that answer[i] is equal to
 *  the product of all the elements of nums except nums[i].

The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.

You must write an algorithm that runs in O(n) time and without using the division operation.

Example 1 :
Input:
	nums = [1,2,3,4]
Output:
	[24,12,8,6]
	
Example 2 :
Input:
	nums = [-1,1,0,-3,3]
Output:
	[0,0,9,0,0]
	
	
Constraints
2 <= nums.length <= 10^5
-30 <= nums[i] <= 30
The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
 */
public class Array11 {
	public static void main(String[] args) 
	{

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of elements: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++)
		{
			System.out.print("Enter element at index "+i+" : ");
			arr[i]=sc.nextInt();
		}
		int[] prefixProduct = new int[n];
		int[] suffixProduct = new int[n];
		int[] answer = new int[n];
		prefixProduct[0]=1;
		suffixProduct[n-1]=1;
		for(int i=1;i<n;i++)
		{
			prefixProduct[i]=arr[i-1]*prefixProduct[i-1];
			suffixProduct[n-i-1]=arr[n-i]*suffixProduct[n-i];
		}
		for(int i=0;i<n;i++)
		{
			answer[i]=prefixProduct[i]*suffixProduct[i];
		}
		for(int i=0;i<n;i++)
		{
			System.out.print(answer[i]+" ");
		}
		sc.close();
	}

}

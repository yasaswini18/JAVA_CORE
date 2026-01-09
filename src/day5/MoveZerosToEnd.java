package day5;

import java.util.Scanner;

/*
 * Given an integer array nums, move all 0’s to the end of it while maintaining 
 * the relative order of the non-zero elements.
Note: You must do this in-place without making a copy of the array.
Example 1 :
Input:
	nums = [0,1,0,3,12]
Output:
	[1,3,12,0,0]
	
Example 2 :
Input:
	nums = [0]
Output:
	[0]
Constraints :
1 <= nums.length <= 10^4
-2^31 <= nums[i] <= 2^31 - 1
 */
public class MoveZerosToEnd {
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
		
		//USING TWO POINTER TECHNIQUE
		int pos = 0;
		for(int i=0 ;i<n;i++)
		{
			if(arr[i]!=0)
			{
				arr[pos++]=arr[i];
			}
		}
		for(int i=pos;i<n;i++)
		{
			arr[i]=0;
		}
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
		sc.close();
	}

}

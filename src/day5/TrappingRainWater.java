package day5;

import java.util.Scanner;

/*
 * Trapping Rain Water
Given n non-negative integers representing an elevation map where the width of each bar is 1, 
compute how much water it can trap after raining.
Example 1
Input:
	height = [0,1,0,2,1,0,1,3,2,1,2,1]
Output:
	6
Explanation:
The above elevation map (black section) is represented by array [0,1,0,2,1,0,1,3,2,1,2,1].
In this case, 6 units of rain water (blue section) are being trapped.
Example 2
Input:
	height = [4,2,0,3,2,5]
Output:
	9	
Constraints
n == height.length
1 <= n <= 2 * 10^4
0 <= height[i] <= 10^5
 */
public class TrappingRainWater {
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
		int[] leftMax = new int[n];
		int[] rightMax = new int[n];
		leftMax[0]=arr[0];
		rightMax[n-1]=arr[n-1];
		for(int i=1;i<n;i++)
		{
			leftMax[i]=	Math.max(leftMax[i-1], arr[i]);
			rightMax[n-i-1]=Math.max(rightMax[n-i], arr[i]);
		}
		int water = 0;
		for(int i=0;i<n;i++)
		{
			water+=Math.min(leftMax[i],rightMax[i])-arr[i];
		}
		System.out.println(water);
		
		sc.close();
	}

}

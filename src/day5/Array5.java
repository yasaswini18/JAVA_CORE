package day5;

import java.util.Scanner;

/*
 * Find the avg of smallest and largest element in array
 * case 1:
 * [1,4,3,2]
 * output: 2.5
 */
public class Array5 {
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
		int smallest = Integer.MAX_VALUE;
		int largest = Integer.MIN_VALUE;
		for(int i:arr)
		{
			if(i<smallest) smallest=i;
			if(i>largest) largest=i;
		}
		double avg = (smallest+largest)/2.0;
		System.out.println(avg);
		sc.close();
	}

}

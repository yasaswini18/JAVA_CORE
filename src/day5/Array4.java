package day5;

import java.util.Scanner;

/*
 * find the count of the elements whose value is equal to the average of the elements of array
 * case 1
 * [2,2,2,2,2]
 * avg  = 10/5 = 2
 * output: 5
 * case 2 
 * [1,3,2,4,5]
 * avg = 15/5 = 3
 * output: 1
 */
public class Array4 {
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
		int avg = 0;
		int sum=0;
		for(int i : arr)
		{
			sum+=i;
		}
		avg = sum/n;
		int count=0;
		for(int i : arr)
		{
			if(i==avg) count++;
		}
		System.out.println(count);
		sc.close();
		
	}

}

package day4;

import java.util.Scanner;

/*
 * WAP to check a given number is abundant number or not
 * abundant number:
 * if the sum of all its proper factors is greater than itself
 * proper factors - all factors except itself
 */

public class AbundantNumber {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		System.out.println(abundantNum(n));
		sc.close();
	}
	public static int abundantNum(int n) 
	{
		int sum=0;
		for(int i=1;i<n;i++)
		{
			if(n%i==0)
			{
				sum+=i;
			}
		}
		if(sum>n) return 1;
		else return 0;
	}

}

package day3;

//WAP to print prime numbers from 1 to 20
//WAP to print prime numbers that are strictly less than n

import java.util.Scanner;
public class PrimeNumberInRange {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
//		prime();
		int n =sc.nextInt();
		int c = 0 ;
		for(int i=2;i<n;i++)
		{
			int count=0;
			for(int j=1;j<=i;j++)
			{
				if(i%j==0) count++;
			}
			if(count==2) c++;
		}
		System.out.println(c);
		sc.close();
	}
	public static void prime()
	{
		
		for(int i=2;i<=20;i++)
		{
			int count=0;
			for(int j=1;j<=i;j++)
			{
				if(i%j==0) count++;
			}
			if(count==2) System.out.println(i);
		}
		
	}

}

package day3;

import java.util.Scanner;

/*
  Write a program to print the first n numbers in the Fibonacci sequence.
	0, 1, 1, 2, 3, 5, 8, 13, ...
 */
public class FibonacciSequence {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = 0;
		int b = 1;
		System.out.println(a+"\n"+b);
		for(int i=3;i<=n;i++)
		{
			int c = a+b;
			System.out.println(c);
			a=b;
			b=c;
		}
		for(int j=0;j<n;j++)
		{
		System.out.println(fibo(j));
		}
		
		sc.close();
	}
	public static int fibo(int n)
	{
		if(n<=1) return n;
		return fibo(n-1)+fibo(n-2);
	}
}

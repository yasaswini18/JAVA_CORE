package day4;

import java.util.Scanner;

/*
 * WAP to find smallest digit
 */
public class DigitSeparation1 {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		smallest(n);
		largest(n);
		secondSmallest(n);
		secondLargest(n);
		sc.close();
	}
	public static void smallest(int n)
	{
		int smallest = Integer.MAX_VALUE;
		while(n!=0)
		{
			int digit = n%10;
			if(digit<smallest)
			{
				smallest=digit;
			}
			n/=10;
		}
		System.out.println(smallest);
	}
	public static void largest(int n)
	{
		int largest = Integer.MIN_VALUE;
		while(n!=0)
		{
			int digit = n%10;
			if(digit>largest)
			{
				largest=digit;
			}
			n/=10;
		}
		System.out.println(largest);
	}
	public static void secondSmallest(int n)
	{
		int smallest = Integer.MAX_VALUE;
		int secondSmallest = Integer.MAX_VALUE;
		while(n!=0)
		{
			int digit = n%10;
			if(digit<smallest )
			{
				
				secondSmallest=smallest;
				smallest=digit;
				
			}else if(digit>smallest && digit<secondSmallest)
			{
				secondSmallest=digit;
			}
			n/=10;
		}
		if(secondSmallest!=Integer.MAX_VALUE) System.out.println(secondSmallest);
		else System.out.println(smallest);
	}
	public static void secondLargest(int n)
	{
		int lar = Integer.MIN_VALUE;
		int secLar = Integer.MIN_VALUE;
		while(n!=0)
		{
			int digit=n%10;
			if(digit>lar)
			{
				secLar=lar;
				lar=digit;
			}else if(digit<lar && digit>secLar)
			{
				secLar=digit;
			}
			n/=10;
		}
		if(secLar!=Integer.MIN_VALUE)System.out.println(secLar);
		else System.out.println(lar);
		
		
		
	}
}

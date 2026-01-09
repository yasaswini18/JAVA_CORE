package day4;

import java.util.Scanner;

/*
 * WAP to check a given number is niven number or not
 * niven num:
 * if the number is divisible by the sum of its digits
 * 
 * WAP to check the factorial of all digits
 * 
 * WAP to check a given number is strong number or not
 * strong number:
 * is sum of factorial of digits is equal to the given number
 */
public class DigitSeparation3 {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		nivenNum(n);
//		factorialOfDigits(n);
//		strongNumber(n);
		strongNumbers();
		
		sc.close();
	}
	public static void nivenNum(int n)
	{
		int x =n;
		int sum=0;
		while(n!=0)
		{
			int digit= n%10;
			sum+=digit;
			n/=10;
		}
		if(x%sum==0) System.out.println("Is a niven number");
		else System.out.println("not a niven number");
	}
	public static void factorialOfDigits(int n)
	{
		
		while(n!=0)
		{
			int fact=1;
			int digit= n%10;
			for(int i=1;i<=digit;i++)
			{
				fact*=i;
			}
			System.out.println(fact);
			n/=10;
		}
		
	}
	public static void strongNumber(int n)
	{
		int sum =0 ;
		int x = n;
		while(n!=0)
		{
			int fact=1;
			int digit= n%10;
			for(int i=1;i<=digit;i++)
			{
				fact*=i;
			}
			sum+=fact;
			n/=10;
		}
		if(sum==x) System.out.println("is a strong number");
		else System.out.println("not a strong number");
		
	}
	public static void strongNumbers()
	{
		for(int i=1;i<=1000;i++)
		{
		int sum =0 ;
		int n = i;
		while(n!=0)
		{
			int fact=1;
			int digit= n%10;
			for(int j=1;j<=digit;j++)
			{
				fact*=j;
			}
			sum+=fact;
			n/=10;
		}
		if(sum==i) System.out.println(i);
		
		}
		
	}
	
	
}

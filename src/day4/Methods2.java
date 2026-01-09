package day4;

import java.util.Scanner;

public class Methods2 {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		numberReport(n);
		
		sc.close();
	}
	
	public static int reverseNumber(int n) 
	{
		int rev=0;
		while(n!=0)
		{
			int digit = n%10;
			rev = rev*10+digit;
			n/=10;
		}
		return rev;
	}
	public static boolean isPalindrome(int n)
	{
		int x=n;
		int rev=0;
		while(n!=0)
		{
			int digit = n%10;
			rev = rev*10+digit;
			n/=10;
		}
		return rev==x;
	}
	public static boolean isStrongNumber(int n)
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
		if(sum==x) return true;
		else return false;
	}
	public static int countPrimeDigits(int n)
	{
		int count=0;
		while(n!=0)
		{
			int digit = n%10;
			int c=0;
			for(int i=1;i<=digit;i++)
			{
				if(digit%i==0) c++;
			}
			if(c==2) count++;
			n/=10;
		}
		return count;
	}
	public static void numberReport(int n) 
	{
		System.out.println(reverseNumber(n));
		System.out.println(isPalindrome(n));
		System.out.println(isStrongNumber(n));
		System.out.println(countPrimeDigits(n));
		
		
	}
	

}

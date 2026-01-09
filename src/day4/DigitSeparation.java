package day4;

/*
 * WAP TO PRINT the digits of a given number
 * WAP to print even digit of a given number
 * WAP to print prime digit of a given number
 * WAP to print sum of all digits of a given number
 * WAP to print the multiplication of even digits sum and odd digits sum of a given number
 */
import java.util.Scanner;

public class DigitSeparation {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
//		digit(n);
//		evenDigit(n);
//		primeDigit(n);
//		sum(n);
		mul(n);
		sc.close();
		
		
	}
	public static void digit(int n)
	{
		while(n!=0)
		{
			int digit = n%10;
			System.out.println(digit);
			n/=10;
				
		}
	}
	public static void evenDigit(int n)
	{
		while(n!=0)
		{
			int digit = n%10;
			if(digit%2==0) System.out.println(digit);
			n/=10;
		}
	}
	public static void primeDigit(int n)
	{
		while(n!=0)
		{
			int digit = n%10;
			int count=0;
			for(int i=1;i<=digit;i++)
			{
				if(digit%i==0) count++;
			}
			if(count==2)System.out.println(digit);
			n/=10;
		}
	}
	public static void sum(int n)
	{
		int sum=0;
		while(n!=0)
		{
			
			int digit=n%10;
			sum+=digit;
			n/=10;
			
		}
		System.out.println(sum);
	}
	public static void mul(int n)
	{
		int sumOdd=0;
		int sumEven=0;
		while(n!=0)
		{
			
			int digit=n%10;
			if(digit%2==0)
			{
				sumEven+=digit;
			}else{
				sumOdd+=digit;
			}
			n/=10;
			
		}
		System.out.println(sumEven*sumOdd);
	}
	
}

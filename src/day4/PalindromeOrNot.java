package day4;

import java.util.Scanner;

public class PalindromeOrNot {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int x = n;
//		int rev=0;
//		while(n!=0)
//		{
//			int digit = n%10;
//			rev = rev*10+digit;
//			n/=10;
//		}
//		if(rev==x) System.out.println("is a palindrome number");
//		else System.out.println("not a palindrome number");
		
		
		palindromeNumbers();
		
		sc.close();
	}
	public static void palindromeNumbers()
	{
		
		for(int i=100;i<=200;i++)
		{
			int n=i;
			int rev=0;
		while(n!=0)
		{
			int digit = n%10;
			rev = rev*10+digit;
			n/=10;
		}
		if(rev==i) System.out.println(i);
		}
		
		
	}
	
}

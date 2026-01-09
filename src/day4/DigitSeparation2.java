package day4;

/*
 * WAP to check whether the given number is special or not
 * special num:
 * if the addition of sum of digits and product of digits is equal to the given number
 * input 
 * 19
 * sum 10
 * product 9
 * 9+10=19 
 * 
 * 
 * WAP to print special numbers from range 1 to 100 
 */
import java.util.Scanner;

public class DigitSeparation2 {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		specialNum(n);
		specialNumbers();
		
		sc.close();
	}
	public  static void specialNum(int n) 
	{
		int x =n;
		int sum = 0;
		int product =  1;
		while(n!=0)
		{
			int digit = n%10;
			sum+=digit;
			product*=digit;
			
			n/=10;
		}
		int add =  sum+product;
		if(add==x) System.out.println(x+" is a special number");
		else System.out.println(x+" is not a special number");
	}
	public  static void specialNumbers() 
	{
		
		
		for(int i=1;i<=100;i++)
		{
			int n=i;
			int sum = 0;
			int product =  1;
		while(n!=0)
		{
			int digit = n%10;
			sum+=digit;
			product*=digit;
			
			n/=10;
		}
		int add =  sum+product;
		if(add==i) System.out.println(i);
		
		}
		
	}
}

package day4;

import java.util.Scanner;

public class DisariumNumber {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = n;
		int y=n;
		int sum=0;
		int count=0;
		while(n!=0)
		{
			count++;
			n/=10;
		}
		
		while(x!=0)
		{
			int digit = x%10;
			sum+=(int)Math.pow(digit, count);
			count--;
			x/=10;
		}
		
		if(sum==y) System.out.println("Disarium number");
		else System.out.println("not disarium number");
		sc.close();
	}
}

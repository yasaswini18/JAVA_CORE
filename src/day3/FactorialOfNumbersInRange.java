package day3;

//WAP to print factorial of all numbers in range 1 to 10
//WAP to print factorial of all odd numbers in range 10 to 1
//WAp to print factorial of all prime numbers from range 14 to 5	
//WAP to print addition of all prime numbers from 32 to 50

public class FactorialOfNumbersInRange {
	public static void main(String[] args) 
	{
//		range();
//		oddRange();
		factPrime();
//		addPrime();
		
	}
	public static void range()
	{
		for(int i=1;i<=10;i++)
		{
			int fact = 1;
			for(int j=1;j<=i;j++)
			{
				fact*=j;
			}
			System.out.println("Factorial of "+i+" is "+fact);
		}
	}
	public static void oddRange()
	{
		for(int i=10;i>=1;i--)
		{
			int fact=1;
			for(int j=1;j<=i;j++)
			{
				fact*=j;
			}
			System.out.println("Factorial of "+i+" is "+fact);
		}
	}
	public static void factPrime()
	{
		for(int i=14;i>=5;i--)
		{
			int count=0;
			int fact=1;
			for(int j=1;j<=i;j++)
			{
				if(i%j==0)
					{count++;}
				fact*=j;
			}
			if(count==2)
			{System.out.println("Factorial of "+i+" is "+fact);
			}
		}
	}
	public static void addPrime()
	{
		int sum=0;
		for(int i=32;i<=50;i++)
		{
			int count=0;
			for(int j=1;j<=i;j++)
			{
				if(i%j==0)count++;
			}
			if(count==2)
			{
				sum+=i;
			}		}
		System.out.println(sum);
	}
}

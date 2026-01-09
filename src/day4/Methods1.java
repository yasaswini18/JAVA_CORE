package day4;

public class Methods1 {
	public static void main(String[] args) {
		System.out.println(findMax(2, 5, 7));
		System.out.println(isPrime(13));
		System.out.println(findMin(2, 5,7));
		System.out.println(fibonacci(8));
		System.out.println(fibonacciNumberOrNot(22));
		
	}
	public static int findMax(int a,int b,int c)
	{
		if(a>b)
		{
			if(a>c) return a;
			else return c;
		}else {
			if(b>c) return b;
			else return c;
		}
	}
	public static boolean isPrime(int num)
	{
		int count=0;
		for(int i=1;i<=num;i++)
		{
			if(num%i==0) count++;
		}
		if(count==2) return true;
		else return false;
	}
	public static int findMin(int a,int b,int c) 
	{
		if(a<b)
		{
			if(a<c) return a;
			else return c;
		}else {
			if(b<c) return b;
			else return c;
		}
		
	}
	public static int fibonacci(int n)
	{
		int a = 0;
		int b = 1;
		for(int i=3;i<=n;i++)
		{
			int c = a+b;
			a=b;
			b=c;
		}
		return b;
	}
	public static boolean fibonacciNumberOrNot(int n)
	{
		int a = 0;
		int b = 1;
		int c = 0;
		while(c<n)
		{
			c=a+b;
			a=b;
			b=c;
		}
		if(c!=n)return false;
		else return true;
	}

}

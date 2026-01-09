package day5;

/*
 * WAP to print numbers from 1 to 1000 without loops
 * WAP to print numbers from 500 to 50 without loops
 * WAP to print sum of all numbers from 1 to 5 without loop
 */
public class BasicRecursion {
	public static void main(String[] args) 
	{
//		print(1);
//		range(500);
		System.out.println(sum(5));
	}
	public static void print(int n) 
	{
		if(n<=1000)
		{
			System.out.println(n);
			print(++n);
		}
	}
	public static void range(int n)
	{
		if(n==50)return;
		if(n%2!=0) {
			System.out.println(n);
			
		}
		range(--n);
		
		
	}
	public static int sum(int n)
	{
		if(n==0) return 0;
		return n+sum(n-1);
	}
	

}

package day3;

/*
 * WAP to print characters from the range
 * d to j
 * m to e
 * z to t
 * r to x
 * using for loop
 * 1111 to 1121
 * 1234 to 1223
 * -1111 to -1121
 * -1234 to -1223
 * using for loop
 */
public class ForLoop {
	public static void main(String[] args)
	{
		for(char a = 'd';a<='j';a++)
		{
			System.out.print(a+" ");
		}
		System.out.println();
		
		for(char a = 'm';a>='e';a--)
		{
			System.out.print(a+" ");
		}
		System.out.println();
		
		for(char a = 'z';a>='t';a--)
		{
			System.out.print(a+" ");
		}
		System.out.println();
		
		for(char a ='r';a<='x';a++)
		{
			System.out.print(a+" ");
		}
		System.out.println();
		
		for(int i=1111;i<=1121;i++)
		{
			System.out.print(i+" ");
		}
		System.out.println();
		
		for(int i=1234;i>=1223;i--)
		{
			System.out.print(i+" ");
		}
		System.out.println();
		
		for(int i=-1111;i>=-1121;i--)
		{
			System.out.print(i+" ");
		}
		System.out.println();
		
		for(int i=-1234;i<=-1223;i++)
		{
			System.out.print(i+" ");
		}
		System.out.println();
	}
}

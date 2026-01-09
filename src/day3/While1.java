package day3;

/*WAP to print characters from the range
 * A to M
 * x to m
 */
public class While1 {
	public static void main(String[] args)
	{
		char ch = 'A';
		while(ch<='M')
		{
			System.out.print(ch+" ");
			ch++;
		}
		System.out.println();
		char c = 'x';
		while(c>='m')
		{
			System.out.print(c+" ");
			c--;
		}
	}
}

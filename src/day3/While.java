package day3;

/*WAP to print number from the range
 * -123 to -129
 * 79 to 84
 * -110 to -100
 * 0 to -9
 * by using while loop
*/
public class While {
	public static void main(String[] args)
	{
		int i = -123;
		while(i>=-129)
		{
			System.out.print(i+" ");
			i--;
		}
		System.out.println();
		int a = 79;
		while(a<=84)
		{
			System.out.print(a+ " ");
			a++;
		}
		System.out.println();
		int b = -110;
		while(b<=-100)
		{
			System.out.print(b+" ");
			b++;
		}
		System.out.println();
		int d = 0;
		while(d>=-9)
		{
			System.out.print(d+ " ");
			d--;
		}
		
		
	}
}

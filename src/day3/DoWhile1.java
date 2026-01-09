package day3;

/*
 * WAP to print characters from the range
 * s to l
 * T to Z
 * using dowhile 
 */
public class DoWhile1 {
	public static void main(String[] args)
	{
		char ch = 's';
		do {
			System.out.print(ch+" ");
			ch--;
		}while(ch>='l');
		System.out.println();
		
		
		char c = 'T';
		do {
			System.out.print(c+" ");
			c++;
		}while(c<='Z');
	}
}

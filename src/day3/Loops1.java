package day3;

/*WAP TO PRINT even numbers from range 1 to 20
 * WAP TO PRINT NUMBERS WHICH ARE DIVISIBLE BY 7 FROM THE RANGE 100 TO 50
 * WAP to print sum of al numbers from the range 1 to 10
 * WAP TO PRINT product of all numbers from the range 1 to 10
 * */
 
public class Loops1 {
	public static void main(String[] args)
	{
		System.out.println("even numbers" );
		for(int i=2;i<=20;i+=2)
		{
			System.out.print(i+" ");
		}
		System.out.println();
		
		int i = 100;
		System.out.println("divisible by 7 are" );
		while(i>=50)
		{	
			if(i%7==0)
			{
				System.out.print(i+" ");
			}
			i--;
		}
		System.out.println();
		int sum=0;
		for(int j=1;j<=10;j++)
		{
			sum+=j;
		}
		System.out.println("sum is "+sum);
		int p=1;
		for(int k=1;k<=10;k++)
		{
			p*=k;
		}
		System.out.println("product is "+p);
	}
}

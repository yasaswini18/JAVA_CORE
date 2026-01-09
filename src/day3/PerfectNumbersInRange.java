package day3;

//WAP  to print perfect numbers in the range 1 to 100
public class PerfectNumbersInRange {
	public static void main(String[] args)
	{
		for(int i=2;i<=100;i++)
		{
			int sum=0;
			for(int j=1;j<i;j++)
			{
				if(i%j==0)
				{
					sum+=j;
				}
			}
			if(sum==i) System.out.println(i);
		}
	}
}

package day5;

/*
 * WAJP to find count of elements which can divide k.
	INPUT :  
	int n=7
	int[] a=9,-13,8,-7,-8,18,10
	int k = 18

	OUTPUT: 2
 */
public class Array3 {
	public static void main(String[] args)
	{
		int[] a = {9,-13,8,-7,-8,18,10};
		int k=18;
		int count=0;
		for(int i  : a)
		{
			if(k%i==0)
			{
				count++;
			}
		}
		System.out.println(count);
	}

}

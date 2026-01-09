package day5;

/*
 * Find the sum of all the numbers that are to be subtracted from each element in the array so that 
 * the result will be divisible by k
 * input
 * [5,9,12,16,25]
 * K=6
 * output 
 * 13
 * explanation
 * ans=0;
 * 5-5=0 divisible by K ans=0+5
 * 9-3=6 ans=5+3
 * 12 already divisible ans=5+3+0
 * 16-4=12 ans=5+3+0+4
 * 25-1=24 ans=5+3+0+4+1
 * ans=13
 */
public class Array12 {
	public static void main(String[] args)
	{
		int[] arr = {5,9,12,16,25};
		int k = 6;
		int ans = 0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%k!=0) 
			{
				ans+=arr[i]%k;
			}
		}
		System.out.println(ans);
	
	}

}

package day5;

/*
 * int[] a = 37,823,122,2322,6017
 * int k=2
 * output: 2322
 * occurrence of digit 2 in each number is
 * 37 -> 0
 * 823 -> 1
 * 122 -> 2
 * 2322 -> 3
 * 6017 -> 0
 * the maximum occurrence of digit 2 is in 2322 so output is 2322
 */
public class Array6 {
	public static void main(String[] args) 
	{
		int[] arr = {37,823,122,2322,6017};
		int k = 2;
		int largestCount = 0;
		int result=0;
		for(int i=0;i<arr.length;i++)
		{
			int count = 0;
			int n =arr[i];
			while(n!=0)
			{
				int digit=n%10;
				if(digit==k)count++;
				n/=10;
			}
			
			if(count>largestCount)
			{
				largestCount=count;
				result=arr[i];
			}
		}
		System.out.println(result);
	}

}

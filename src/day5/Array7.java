package day5;

/*
 * WAP to reverse each element(number) of an array and place it in the same index position
 * input [123,456,789];
 * output [321,654,987]
 */
public class Array7 {
	public static void main(String[] args)
	{
		int arr[] = {123,456,789};
		for(int i=0;i<arr.length;i++)
		{
			int rev = 0;
			while(arr[i]!=0)
			{
				int digit = arr[i]%10;
				rev = rev*10+digit;
				arr[i]/=10;
			}
			arr[i]=rev;
		}
		for(int i:arr)
		{
			System.out.print(i+" ");
		}
	}
}

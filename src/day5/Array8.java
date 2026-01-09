package day5;

/*
 * WAP to find pairs whose sum is equal to the given target
 * Enter size of array:
5
Enter array elements:
1 2 3 4 5
Enter target:
9
Output
Copy code
3 4 -print indices 
 */
public class Array8 {
	public static void main(String[] args) 
	{
		int[] arr = {1,2,3,4,5};
		int sum = 9;
		for(int i=0;i<arr.length;i++)
		{
			int target = sum-arr[i];
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[j]==target) 
					{
					System.out.print(i+" "+j);
					break;
					}
			}
			
		}
	}
}

package day5;

/*
 * find and print all the leaders of an array
 * a leader is defined as an element of the array which is greater than all its following elements
 * rightmost element is always a leader
 * {8,7,4,3,5,2} 
 * output 8,7,5,2
 */
public class Array9 {
	public static void main(String[] args) 
	{
		int[] arr = {8,7,4,3,5,2};
		for(int i=0;i<arr.length;i++)
		{
			boolean isLeader = true;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]<arr[j]) isLeader=false;
			}
			if(isLeader)
			   System.out.print(arr[i]+" ");
		}
	}

}

package day5;
/*
 * String s = "java is a programming language it is a high level programming language" ;

java = 1
is = 2
a = 2
programming = 2
language = 2
it = 1
high = 1
level = 1
 */
public class Strings {
	public static void main(String[] args) {
		String s = "java is a programming language it is a high level programming language" ;
		String[] arr = s.split(" ");
		for(int i=0;i<arr.length;i++)
		{
			int count =0 ;
			boolean isPresent = false;
			for(int j =0;j<i;j++)
			{
				if(arr[i].equals(arr[j])) isPresent = true;
			}
			if(isPresent)
				continue;
			for(int j=i;j<arr.length;j++)
			{
				if(arr[j].equals(arr[i])) count++;
			}
			System.out.println(arr[i]+" = "+count);
		}
		
	}

}

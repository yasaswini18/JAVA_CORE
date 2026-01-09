package day6;

public class OverLoadingMainMethod {
	public static void main(String[] args)
	{
		main(2,3);
		
	}
	public static void main(int a,int b)
	{
		System.out.println(a+b);
	}

}

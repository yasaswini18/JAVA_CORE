package day4;

public class MethodOverLoading1 {
	public static void main(String[] args) 
	{
		greet();
		greet("yash");
		greet("yash",21);
	}
	public static void greet() 
	{
		System.out.println("Hello");
	}
	public static void greet(String name) 
	{
		System.out.println("Hello "+name);
	}
	public static void greet(String name,int age) 
	{
		System.out.println("Hello "+name+" You are "+age+" years old");
	}
	

}

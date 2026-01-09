package day11;

public class Abstraction {
	public static void main(String[] args) {
		Father f = new Son();
		f.test();
		f.demo();
		f.abs();
	}

}
abstract class Father{
	int a = 10;
	static int b = 20;
	public static void test()
	{
		System.out.println("Static concrete method");
	}
	public void demo()
	{
		System.out.println("No static concrete method");
	}
	abstract public void abs();
	static {
		System.out.println("Static initializer block");
	}
	{
		System.out.println("Non static initializer block");
	}
	Father()
	{
		System.out.println("Constructor");
	}
}
class Son extends Father{
	@Override
	public void abs()
	{
		System.out.println("Overridden method");
	}
}

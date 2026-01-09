package day12;

public class Interface {
	public static void main(String[] args) {
		Father1 f = new Son1();
		f.test();
		System.out.println(f.add(3,5));
	}

}
interface Father1{
	abstract public void test();
	abstract public int add(int a,int b);
}
class Son1 implements Father1{
	@Override
	public void test()
	{
		System.out.println("overriden son method");
	}
	@Override
	public int add(int a,int b)
	{
		return a+b;
	}
	
}
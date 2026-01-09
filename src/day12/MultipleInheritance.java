package day12;

public class MultipleInheritance {
public static void main(String[] args) {
	Father f = new 	Son();
	Mother m = new Son();
	Son s = new Son();
	Father.test();
	Mother.test();
	f.abs();
	m.abs();
	s.abs();
	System.out.println(f.a);
	System.out.println(Mother.b);
}
}
interface Father{
	int a = 10;
	public static void test()
	{
		System.out.println("Static Father test method");
	}

	void abs();
	
}
interface Mother{
	int b = 20;
	public static void test()
	{
		System.out.println("Static Mother test method");
	}
	void abs();
}

class Son implements Father,Mother{
	int c = 30;
	@Override
	public void abs()
	{
	   System.out.println("Son abstract method");
	}
    
}

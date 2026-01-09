package day9;

public class IsA_Inheritence {
	public static void main(String[] args) {
		System.out.println(Son.a);
		System.out.println(Son.b);
		Son.demo();
		Son.name();
	}
}
class Father{
	static int a = 10;
	static {
		System.out.println("SIB Father class");
	}
	public static void name() {
		System.out.println("Father class static method");
	}
}
class Son extends Father{
	static int b = 20;
	static {
		System.out.println("SIB Son class");
	}
	public static void demo() {
		System.out.println("Son class static method");
	}
}
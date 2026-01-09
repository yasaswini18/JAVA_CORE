package day7;

public class StaticNonStaticBlock {
	static {System.out.println("static block executed");
		StaticNonStaticBlock obj = new StaticNonStaticBlock();
		obj.print();
	}
	{
		System.out.println("Non static block executed");
	}
	public void print() {
		System.out.println("non static method executed");
	}
	public static void main(String[] args)
	{
		System.out.println("main method executed");
	}

}

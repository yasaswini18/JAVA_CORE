package day10;

public class TypeCastingNonPrimitive {
	public static void main(String[] args) {
		Father ref1 = new Father();
		System.out.println(ref1.a);
//		System.out.println(ref1.b); //CTE
		Son ref2 = new Son();
		System.out.println(ref2.a);
		System.out.println(ref2.b);
		
		//upcasting
		Father f = new Son();
		System.out.println(f.a);
//		System.out.println(f.b); //CTE
		
		//downcasting
		Son s = (Son)f;
		System.out.println(s.a);
		System.out.println(s.b);
		
	}

}
class Father{
	int a = 10;
	
}
class Son extends Father{
	int b = 20;
}


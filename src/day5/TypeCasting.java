package day5;

/*
 * WAP  to convert double value 45.78 into int and print
 * WAP  to convert int value 130 into byte and print
 * WAP  to convert long -> int -> short -> byte .use value 987654321.
 */
public class TypeCasting {
	public static void main(String[] args) 
	{
		doubleToInt();
		intToByte();
		narrowing();
	}
	public static void doubleToInt() 
	{
		double d = 45.78;
		int i = (int)d;
		System.out.println(i);
	}
	public static void intToByte()
	{
		int i = 130;
		byte b = (byte)i;
		System.out.println(b);
	}
	public static void narrowing()
	{
		long  l = 987654321;
		int i = (int)l;
		short s = (short)i;
		byte b = (byte)s;
		System.out.println("long "+l);
		System.out.println("int "+i);
		System.out.println("short "+s);
		System.out.println("byte "+b);
	}
	

}

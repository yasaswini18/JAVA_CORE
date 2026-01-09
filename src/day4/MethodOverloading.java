package day4;

public class MethodOverloading {
	public static void main(String[] args) 
	{
		System.out.println(calculateArea(20));
		System.out.println(calulateArea(14.4));
		System.out.println(calculateArea(12, 2));
	}
	public static double calculateArea(int side)
	{
		System.out.println("area of square");
		return side*side;
	}
	public static double calulateArea(double radius)
	{
		System.out.println("area of circle");
		return 3.14*radius*radius;
	}
	public static double calculateArea(int length,int breadth)
	{
		System.out.println("area of rectangle");
		return length*breadth;
	}

}

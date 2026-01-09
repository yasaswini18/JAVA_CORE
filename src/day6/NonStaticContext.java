package day6;

/*
 * Write a Java program that satisfies all the following conditions:

Requirements
	1.	Create a class named Processor.
	2.	Declare two non-static variables x and y.

	4.	Initialize the instance variables only inside a non-static method using the this keyword.
	5.	Create three non-static methods:
	•	initialize() – assigns values to x and y using this.
	•	update() – modifies the values of x and y and demonstrates variable shadowing by 
	declaring a local variable with the same name as one instance variable.
	•	display() – prints the final values of the instance variables.
	6.	One non-static method must call another non-static method using the this keyword.
 */
public class NonStaticContext {
	public static void main(String[] args)
	{
		Processor obj = new Processor();
		obj.initialize();
		obj.display();
		A obj1 = new A();
		obj1.test();
	}
	
}
class Processor{
	int x;
	int y;
	public void initialize()
	{
		this.x=10;
		this.y=5;
		System.out.println("Initial x = "+x);
		System.out.println("Initial y = "+y);
	}
	public void update()
	{
		x = 15;
		y = 20;
		int x = 35; //local variable
		System.out.println("Shadowing after taking local x = "+x);
		System.out.println("Updated value: x = "+this.x);
		System.out.println("Updated value: y = "+y);
	}
	public void display()
	{
		this.update();
		System.out.println("FINAL x = "+x);
		System.out.println("FINAL y = "+y);
	}
}
class A{
	static int x = 10;
	 void test()
	{
		int x = 20;
		System.out.println(x);
		System.out.println(this.x);
		
	}
}

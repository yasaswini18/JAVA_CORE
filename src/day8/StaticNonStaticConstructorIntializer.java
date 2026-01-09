package day8;
/*
 * 4. Write a Java program that defines a class named DemoClass with the following specifications:

The class should contain two Static Initialization Blocks (SIBs) that print messages when they execute.
The class should contain one Instance Initialization Block (IIB) that prints a message when it executes.
The class should contain one non-static method named displayMessage(), which prints a message when called.
The class should contain two static methods:
staticMethodOne(): Prints a message when called.
staticMethodTwo(): Prints a different message when called.

Inside the main() method, perform the following actions:
Call both static methods directly using the class name.
Create an object of the class, which should trigger the execution of SIBs, IIB, and constructor.
Call the non-static method using the object reference.
 */
public class StaticNonStaticConstructorIntializer {
	static {
		System.out.println("First static initialization block");
	}
	static {
		System.out.println("Second static initialization block");
	}
	{
		System.out.println("Instance initialization block");
	}
	public void displayMessage()
	{
		System.out.println("Non static method");
	}
	public static void staticMethodOne()
	{
		System.out.println("First static method");
	}
	public static void staticMethodTwo()
	{
		System.out.println("Second static method");
	}
	StaticNonStaticConstructorIntializer()
	{
		System.out.println("Constructor");
	}
	public static void main(String[] args) {
		StaticNonStaticConstructorIntializer.staticMethodOne();
		StaticNonStaticConstructorIntializer.staticMethodTwo();
		StaticNonStaticConstructorIntializer obj = new StaticNonStaticConstructorIntializer();
		obj.displayMessage();
	}


}

package day8;
/*
 * 3. Write a Java program to demonstrate method overloading by defining both static 
 * and non-static methods with the same name but different parameter lists. 
 * Your program should include the following:

A class named OverloadingExample containing:

A static method named display() that takes an int parameter and prints a message.
A static method named display() that takes a String parameter and prints a message.
A non-static method named display() that takes two parameters: an int and a double, and prints a message.
A non-static method named display() that takes no parameters and prints a default message. 
 */
public class MethodOverloading {
	public static void main(String[] args) {
		display(5);
		display("yash");
		MethodOverloading obj = new MethodOverloading();
		obj.display();
		obj.display(5, 5.5);
		
	}
	public static void display(int n)
	{
		System.out.println("Static int parameter method");
	}
	public static void display(String n)
	{
		System.out.println("Static string parameter method");
	}
	public  void display(int a,double b)
	{
		System.out.println("Non Static int,double parameter method");
	}
	public  void display()
	{
		System.out.println("Non Static no parameter method");
	}

}

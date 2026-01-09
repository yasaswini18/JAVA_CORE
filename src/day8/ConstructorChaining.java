package day8;
/*
 * Write a Java program to create a Laptop class that demonstrates constructor chaining using this().

Requirements:

The Laptop class should have three instance variables:
brand (String)
ramSize (int)
price (double)

Implement the following constructors using constructor chaining (this()):

Default constructor that sets default values ("Unknown", 8GB, 50000.0).
Constructor with only brand (calls the default constructor).
Constructor with brand and ramSize (calls the constructor with brand).
Constructor with all three fields (brand, ramSize, price) --(the final constructor)--.

Create a printDetails() method to display laptop details.

In main(), create different Laptop objects using all constructors and print their details.
 */
public class ConstructorChaining {
	public static void main(String[] args) {
		Laptop obj1 = new Laptop();
		Laptop obj2 = new Laptop("HP");
		Laptop obj3 = new Laptop("HP", 50);
		Laptop obj4 = new Laptop("HP",50,80000);
		obj1.printDetails();
		obj2.printDetails();
		obj3.printDetails();
		obj4.printDetails();
	}

}
class Laptop{
	String brand;
	int ramSize;
	double price;
	Laptop()
	{
		brand = "Unknown";
		ramSize = 8;
		price=50000.0;
	}
	Laptop(String brand)
	{
		this();
		this.brand=brand;
	}
	Laptop(String brand,int ramSize)
	{
		this(brand);
		this.ramSize=ramSize;
	}
	Laptop(String brand,int ramSize,double price)
	{
		this(brand,ramSize);
		this.price=price;
	}
	public void printDetails()
	{
		System.out.println("Laptop Details");
		System.out.println("brand: "+brand);
		System.out.println("ramSize: "+ramSize);
		System.out.println("price: "+price);
	}
	
}

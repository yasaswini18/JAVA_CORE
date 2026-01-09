package day8;
/*
 * Write a Java program to create a class called Person with private instance variables name, age. and country.
 *  Provide public getter and setter methods to access and modify these variables.
 *  
 *  
 *   Write a Java program to create a class called Employee with 
 *   private instance variables employee_id, employee_name, and employee_salary. 
 *   Provide public getter and setter methods to access and modify the id and name variables,
 *    but provide a getter method for the salary variable that returns a formatted string.
 *    
 *    Write a Java program to create a class called Circle with a private instance variable radius. 
 *    Provide public getter and setter methods to access and modify the radius variable.
 *     However, provide two methods called calculateArea() and calculatePerimeter() that 
 *     return the calculated area and perimeter based on the current radius value.
 */

public class Encapsulation {
	public static void main(String[] args) {
//		Person obj = new Person();
//		System.out.println(obj.getName());
//		System.out.println(obj.getAge());
//		System.out.println(obj.getCountry());
//		System.out.println("-*********************-");
//		obj.setName("yash");
//		obj.setAge(21);
//		obj.setCountry("India");
//		System.out.println(obj.getName());
//		System.out.println(obj.getAge());
//		System.out.println(obj.getCountry());
		
		
//		EmployeeDetails emp1 = new EmployeeDetails3();
//		emp1.setId(1);
//		emp1.setName("yash");
//		emp1.setSalary(90000);
//		System.out.println(emp1.getId());
//		System.out.println(emp1.getName());
//		System.out.println(emp1.getSalary());
		
		Circle ob = new Circle();
		ob.setRadius(2.4);
		System.out.println("Radius: "+ob.getRadius());
		System.out.printf("Area: %.2f",ob.calculatedArea());
		System.out.println();
		System.out.printf("Perimeter: %.2f",ob.calculatePerimeter());
		
	}

}
class Person{
	private String name;
	private int age;
	private String country;
	public String getName()
	{
		return name;
	}
	public int getAge()
	{
		return age;
	}
	public String getCountry()
	{
		return country;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public void setAge(int age)
	{
		this.age=age;
	}
	public void setCountry(String country)
	{
		this.country=country;
	}
}
class EmployeeDetails{
	private int id;
	private String name;
	private double salary;
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public int getId()
	{
		return id;
	}
	public String getName()
	{
		return name;
	}
	public String getSalary()
	{
		return "The salary is : "+salary;
	}
	
}
class Circle{
	private double radius;
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public double getRadius() {
		return radius;
	}
	public double calculatedArea()
	{
		return 3.14*radius*radius;
	}
	public double calculatePerimeter()
	{
		return 2*3.14*radius;
	}
}
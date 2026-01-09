package day7;
/*
 * A company stores employee details along with address information.
Question
Create classes:
	1. Address → city
	2. Employee → id, Address address
Add:
	parameterized constructor
	copy constructor that performs shallow copy
Steps:
	1	Create employee emp1
	2	Create emp2 using copy constructor
	3	Change city via emp2
	4	Print city of both employees
 */
public class CopyContructor1 {
	public static void main(String[] args) {
		Address ad = new Address("visakhapatnam");
		Employee emp1 = new Employee(1,ad);
		Employee emp2 = new Employee(emp1);
		Address ad1 = new Address("banglore");
		emp2.address=ad1;
		System.out.println("Details of employee 1: ");
		System.out.println("Id: "+emp1.id);
		System.out.println("Address: "+emp1.address.city);
		System.out.println("Details of employee 2: ");
		System.out.println("Id: "+emp2.id);
		System.out.println("Address: "+emp2.address.city);
		
		
		
		
	}

}
class Address{
	String city;
	Address(String city)
	{
		this.city=city;
	}
}
class Employee{
	int id;
	Address address;
	Employee(int id ,Address address)
	{
		this.id=id;
		this.address=address;
	}
	Employee(Employee emp)
	{
		this.id=emp.id;
		this.address=emp.address;
	}
}
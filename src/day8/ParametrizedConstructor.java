package day8;
/*
 * 2. Write a Java program that performs the following tasks:
Create a class Employee with three attributes: id, name, and sal (salary).
Implement a parameterized constructor to initialize these attributes.
Create a non-static method printDetails() to display employee details.
In the main() method:
Create an 4 Employee object
 */
public class ParametrizedConstructor {
	public static void main(String[] args) {
		System.out.println("Employee Details : ");
		Employee emp1= new Employee(1,"Yasaswini",90000);
		Employee emp2= new Employee(2,"Parvathi",80000);
		Employee emp3= new Employee(3,"Sidhant",95000);
		Employee emp4= new Employee(4,"Ram",70000);
		emp1.printDetails();
		emp2.printDetails();
		emp3.printDetails();
		emp4.printDetails();
		
	}

}
class Employee{
	int id;
	String name;
	double sal;
	Employee(int id,String name,double sal)
	{
		this.id=id;
		this.name=name;
		this.sal=sal;
	}
	public void printDetails()
	{
		System.out.println("ID: "+id);
		System.out.println("Name: "+name);
		System.out.println("Salary: "+sal);
		System.out.println("*************************");
		
	}
}
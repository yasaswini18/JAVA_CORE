package day15;
/*
 * You are given a Java program that defines two classes: Employee and Company.
- The Employee class has attributes for employee ID, name, and salary. It also 
contains a static method to create new Employee objects and a method to display 
employee details.
- The Company class maintains a list of employees and displays their details.
 */
import java.util.ArrayList;
import java.util.List;

public class ArrayListThree {
	public static void main(String[] args)
	{
		new Company();
		
	}

}
class Employee{
	int empId;
	String name;
	double salary;
	
	Employee(int empId,String name,double salary)
	{
		this.empId= empId;
		this.name=name;
		this.salary=salary;
	}
	public static Employee create(int id,String name,double salary)
	{
	     return new Employee(id,name,salary);
	}
	public void display()
	{
		System.out.println("Id: "+empId);
		System.out.println("Name: "+name);
		System.out.println("Salary: "+salary);
	}
}
class Company{
	
	List<Employee> list = new ArrayList<>();
	
	Company()
	{
	list.add(Employee.create(1,"Yash",120000));
	list.add(Employee.create(2,"Sidd",140000));
	list.add(Employee.create(3,"Simpi",234562));
	
	for(Employee e : list) {
	  e.display();
	}
	}
	
	
	
}
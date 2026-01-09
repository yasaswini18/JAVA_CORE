package day2;

import java.util.Scanner;
public class EmployeeAccessAndSalaryProcessingSystem {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter employee id : ");
		int empId = sc.nextInt();
		System.out.print("Enter employee name : ");
		String empName = sc.next();
		sc.nextLine();
		System.out.print("Enter employee age : ");
		int empAge = sc.nextInt();
		if(empAge<21)
		{
			System.out.println("Employee is not eligible to work");
			return;
		}
		System.out.print("Enter the choice 1-IT 2-HR 3-Finance: ");
		int choice = sc.nextInt();
		String dep="";
		String role="";
		int allowance = 0;
		switch(choice)
		{
		case 1:
			dep="IT";
			System.out.print("Enter the num for role 1-developer 2-tester");
			int n1 = sc.nextInt();
			switch(n1)
			{
			case 1:
				role="developer";
				allowance=30;
				break;
			case 2:
				role="tester";
				allowance=25;
				break;
				default:
					System.out.println("Not applicable");
			}
			break;
		case 2:
			dep="HR";
			System.out.print("Enter the num for role 1-recruiter 2-payroll");
			int n2 = sc.nextInt();
			switch(n2)
			{
			case 1:
				role="recruiter";
				allowance=20;
				break;
			case 2:
				role="payroll";
				allowance=22;
				break;
			default:
				System.out.println("Not applicable");
			}
			break;
		case 3:
			dep="Finance";
			System.out.print("Enter the num for role 1-accountant 2-auditor");
			int n3=sc.nextInt();
			switch(n3)
			{
			case 1:
				role="accountant";
				allowance=28;
				break;
			case 2:
				role="auditor";
				allowance=26;
				break;
			default:
				System.out.println("Not applicable");
			}
			break;
		default:
			System.out.println("no department with that choice");
			break;
			
		}
		System.out.print("Enter basic salary : ");
		double basicSal = sc.nextDouble();
		double finalSal = basicSal + (basicSal*allowance/100);
		
		String access = "";
		
		if(finalSal>=60000 && dep.equals("IT"))
		{
			access="Admin access";
		}else if(finalSal>=60000 && !(dep.equals("IT")))
				{
			access="Manager access";
				}else {
					access="Manager access";
				}
		
		
		System.out.println("Details of the employee: ");
		System.out.println("Employee ID : "+empId);
		System.out.println("Employee Name : "+empName);
		System.out.println("Employee age : "+empAge);
		System.out.println("Employee Department : "+dep);
		System.out.println("Employee Role : "+role);
		System.out.println("Employee Basic Salary : "+basicSal);
		System.out.println("Employee Final Salary : "+finalSal);
		System.out.println("Employee Access Level : "+access);
		
	}

}

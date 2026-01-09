package day2;

/*
 WAP to display an employees designation based on the department and role selected by user
 IT - DEVELOPER , TESTER , DEVOPS ENGINEER
 HR - RECRUITER,HR EXECUTIVE,PAYROLL OFFICER
 FINANCE - ACCOUNTANT , FINANCIAL ANALYST , AUDITOR
 OPERATIONS - OPERATION EXECUTIVE,TEAM LEAD,MANAGER 
 */
 
import java.util.Scanner;
public class Prog6 {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter department ");
		String dep = sc.nextLine().toLowerCase();
		System.out.println("Enter role : ");
		String role = sc.nextLine().toLowerCase();
		switch(dep) {
			case "it":
				switch(role)
				{
				case "developer":
					System.out.println("Designation is "+role+" in "+dep);
					break;
				case "tester":
					System.out.println("Designation is "+role+" in "+dep);
					break;
				case "devops engineer":
					System.out.println("Designation is "+role+" in "+dep);
					break;
					default:
						System.out.println("Not applicable");
				}
				break;
			case "hr":
				switch(role)
				{
				case "recruiter":
					System.out.println("Designation is "+role+" in "+dep);
					break;
				case "hr executive":
					System.out.println("Designation is "+role+" in "+dep);
					break;
				case "payroll officer":
					System.out.println("Designation is "+role+" in "+dep);
					break;
				default:
					System.out.println("Not applicable");
				}
				break;
			case "finance":
				switch(role)
				{
				case "accountant":
					System.out.println("Designation is "+role+" in "+dep);
					break;
				case "financial analyst":
					System.out.println("Designation is "+role+" in "+dep);
					break;
				case "auditor":
					System.out.println("Designation is "+role+" in "+dep);
					break;
				default:
					System.out.println("Not applicable");
				}
				break;
			case "operations":
				switch(role)
				{
				case "operation executive":
					System.out.println("Designation is "+role+" in "+dep);
					break;
				case "team lead":
					System.out.println("Designation is "+role+" in "+dep);
					break;
				case "manager":
					System.out.println("Designation is "+role+" in "+dep);
					break;
				default:
					System.out.println("Not applicable");
				}
				break;
			default:
				System.out.println("Not applicable");
				
		}
		
	}
}

package day2;

/*
 * WAP to perform area calculation
 * circle
 * rectangle
 * triangle
 * square
 */
import java.util.Scanner;
public class Prog7 {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the shape on which you want to find area: ");
		String shape = sc.nextLine().toLowerCase();
		double area=1;
		switch(shape)
		{
		case "circle":
			System.out.print("Enter radius : ");
			double r = sc.nextDouble();
			area = 3.14*r*r;
			break;
		case "rectangle":
			System.out.println("Enter length and breadth: ");
			double l = sc.nextDouble();
			double b =  sc.nextDouble();
			area = l*b;
			break;
		case "triangle":
			System.out.println("Enter height and base: ");
			double h =  sc.nextDouble();
			double ba = sc.nextDouble();
			area = h*ba/2;
			break;
		case "square":
			System.out.println("enter side ");
			double s = sc.nextDouble();
			area = s*s;
			break;
		default:
			System.out.println("not applicable");
		}
		System.out.println("area	 of "+shape+" is "+area);
	}
	
}

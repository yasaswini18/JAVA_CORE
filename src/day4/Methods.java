package day4;

import java.util.Scanner;

public class Methods {
	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of operands: ");
		sc.nextInt();
		System.out.print("Enter the choice 1-add 2 variables , 2-add 3 variables,3-sub 4 variables,4-mul three variables: ");
		int choice = sc.nextInt();
		switch(choice)
		{
		case 1:
			int a = sc.nextInt();
			int b = sc.nextInt();
			add(a,b);
			break;
		case 2:
			int a1 = sc.nextInt();
			int b1 = sc.nextInt();
			int c1 = sc.nextInt();
			add(a1,b1,c1);
			break;
		case 3:
			int a2 = sc.nextInt();
			int b2 = sc.nextInt();
			int c2 = sc.nextInt();
			int d2 = sc.nextInt();
			sub(a2,b2,c2,d2);
			break;
		case 4:
			int a3 = sc.nextInt();
			int b3 = sc.nextInt();
			int c3 = sc.nextInt();
			mul(a3,b3,c3);
			break;
			
		default:
			System.out.println("Invalid");
		}
		sc.close();
		
	}
	public static void add(int a,int b,int c)
	{
		System.out.println(a+b+c);
	}
	public static void add(int a,int b)
	{
		System.out.println(a+b);
	}
	public static void mul(int a,int b,int c)
	{
		System.out.println(a*b*c);
	}
	public static void sub(int a,int b,int c,int d)
	{
		System.out.println(a-b-c-d);
	}

}


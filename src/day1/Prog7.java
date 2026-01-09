package day1;

import java.util.Scanner;
public class Prog7 {
	public static void main(String[] args)
	{
//		EvenOdd();
//		DivisibleBySeven();
//		DivisibleByThreeAndFive();
//		IsVowelOrConsonent();
//		digitOrNot();
//		whichCharacter();
//		grades();
//		caseCharacter();
//		checkNum();
//		max();
		min();
	}
	
	
	//check num is even or odd using if statement only
	public static void EvenOdd()
	{	
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter input : ");
		int a = sc.nextInt();
		if(a%2==0) System.out.println("even");
		if(a%2!=0) System.out.println("odd");
	}
	
	
	//check whether the num is divisible by 7 or not
	public static void DivisibleBySeven()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter input : ");
		int a = sc.nextInt();
		if(a%7==0) System.out.println(a+" is divisible by 7");
		else System.out.println(a+" is not divisible by 7");
	}
	
	
	//check whether the num is divisible by both 3 and 5 or not
	public static void DivisibleByThreeAndFive()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter input : ");
		int a = sc.nextInt();
		if(a%3==0 && a%5==0) System.out.println(a+ " is Divisible by both 3 and 5");
		else System.out.println(a+" is not divisible by both 3 and 5");
	}
	
	
	//check the given character is vowel or consonant
	public static void IsVowelOrConsonent()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter input : ");
		char a = sc.next().toUpperCase().charAt(0);
		if(a=='A' || a=='E' || a=='I' || a=='O' ||a=='U')
		{
			System.out.println(a+" is a vowel");
		}else {
			System.out.println(a+" is a consonant");
		}
	}
	
	
	//check the given character is digit or not
	public static void digitOrNot()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter input : ");
		char a = sc.next().toUpperCase().charAt(0);
		if(a>='0' && a<='9') System.out.println("is a digit");
		else System.out.println("is not a digit");
	}
	
	
	//WAP to check whether the given character is uppercase,lowercase,digit or special character
	public static void whichCharacter()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter input : ");
		char a = sc.next().charAt(0);
		if(a>='A' && a<='Z') System.out.println("is uppercase");
		else if(a>='a' && a<='z') System.out.println("is lowercase");
		else if(a>='0' && a<='9') System.out.println("is digit");
		else System.out.println("is special character");
	}
	
	
	/*WAP to calculate to calculate and display the grade of a student based on the marks obtained
	marks>=90 grade A
	marks>=75 and <90 grade B
	marks>=60 and <75 grade C
	marks>=40 and <60 grade D
	marks < 40 fail
	marks invalid print "invalid marks"
	*/
	public static void grades()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter input : ");
		int marks = sc.nextInt();
		if(marks>=90) System.out.println("Grade A");
		else if(marks>=75 && marks<90) System.out.println("grade B");
		else if(marks>=60 && marks<75) System.out.println("grade C");
		else if(marks>=40 && marks<60) System.out.println("grade D");
		else if(marks<40) System.out.println("fail");
		else System.out.println("invalid marks");
	}
	
	
	//WAP to check whether the given character is upper case vowel,upper case consonant,lower case vowel or lower case consonant
	public static void caseCharacter()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter input : ");
		char a = sc.next().charAt(0);
		if(a>='a' &&a<='z')
		{
			if(a=='a'||a=='e'||a=='i'||a=='o'||a=='u')
			{
				System.out.println("lower case vowel");
			}else {
				System.out.println("lower case consonant");
			}
		}else if(a>='A' && a<='Z')
		{
			if(a=='A'||a=='E'||a=='I' ||a=='O' || a=='U')
			{
				System.out.println("upper case vowel");
			}else {
				System.out.println("upper case consonant");
			}
		}else System.out.println("not character");
	}
	
	
	//WAP to check the given number is negative or positive or zero
	public static void checkNum()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter input : ");
		int a = sc.nextInt();
		if(a>0) System.out.println("positive");
		else if(a<0) System.out.println("negative");
		else System.out.println("zero");
	}
	
	
	//WAP to find the max number from three numbers
	public static void max()
	{
		int a=5,b=6,c=7;
		System.out.println("max is ");
		if(a>b)
		{
			if(a>c)System.out.println(a);
			else System.out.println(c);
		}else {
			if(b>c) System.out.println(b);
			else System.out.println(c);
		}
	}
	
	
	//WAP to find the min number from three numbers
	public static void min()
	{
		int a=5,b=6,c=7;
		System.out.println("min is ");
		if(a<b)
		{
			if(a<c)System.out.println(a);
			else System.out.println(c);
		}else {
			if(b<c) System.out.println(b);
			else System.out.println(c);
		}
	}
	
	
	
}

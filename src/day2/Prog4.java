package day2;

//WAP that takes students mark as input(A,B,C,D,F) and uses a switch to print message
import java.util.Scanner;
public class Prog4 {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		char grade = sc.next().charAt(0);
		switch(grade)
		{
		case 'A' :
			System.out.println("Excellent");
		    break;
		case 'B':
			System.out.println("Good");
			break;
		case 'C':
			System.out.println("Fair");
			break;
		case 'D':
			System.out.println("Pass");
			break;
		case 'F':
			System.out.println("Fail");
			break;
		default:
			System.out.println("Sorry, I dont have information about that");
		}
	}
}
package day3;

import java.util.Scanner;

/*
 Write a Java method clockProblem(int input1, int input2) that simulates a 12-hour analog clock.

	Problem Requirements
	input1 represents the current hour position on a clock (1–12).
	input2 represents the number of jumps/multiplication factor.
	Multiply input1 and input2 to calculate the movement.
	The clock should always stay within 1 to 12.
	If the calculated value exceeds 12, it should wrap around using clock logic.
	If the final calculated position becomes 0, it must be treated as 12.
	Test case 1 : 
	input1 = 3
	input2 = 4
	
	output is  12.
	Test case 2 : 
	input1 = 4
	input2 = 5
	
	output is 8.
	
	Test case 3:
	input1 = 9
	input2 = 7
	
	output is 3.
 */
public class MethodsClockProblem {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the current hour position (1-12): ");
		int n1 = sc.nextInt();
		System.out.print("Enter the multiplication factor or the number of jump");
		int n2 = sc.nextInt();
		clockProblem(n1, n2);
		sc.close();
	}
	public static void clockProblem(int n1,int n2)
	{
		int movement = (n1*n2)%12;
		if(movement==0) movement=12;
		System.out.println(movement);
	}
}

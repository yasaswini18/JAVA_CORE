package day3;


/*
 * WAP given a number for each integer i in the range from 1 to n inclusive
 * print out one value in one line
 * if i is a multiple of both 3 and 5 print FizzBuzz
 * if i is a multiple of 3(but not 5) print Fizz
 * if i is a multiple of 5(but not 3) print Buzz
 * if i is not a multiple of both 3 or 5 print the value of i
 * 
 */

import java.util.Scanner;
public class Loops2 {
	public static void main(String[]  args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			if(i%3==0 && i%5==0)
			{
				System.out.println("FizzBuzz");
			}else if(i%3==0 && i%5!=0)
			{
				System.out.println("Fizz");
			}else if(i%5==0 && i%3!=0)
			{
				System.out.println("Buzz");
			}else {
				System.out.println(i);
			}
		}
		sc.close();
		
	}

}

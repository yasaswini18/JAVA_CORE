package day2;
import java.util.Scanner;
//WAP to check leap year and if leap year A leap year: divisible by 400 or divisible by 4 but not by 100
public class Prog2 {
 public static void main(String[] args)
 {
	 Scanner sc = new Scanner(System.in);
	 int year = sc.nextInt();
	 if(year%400==0 || (year%4==0 && year%100!=0))
			 {
		 System.out.println("Is a leap year");
			 }else {
				 System.out.println("not a leap year");
			 }
 }
}

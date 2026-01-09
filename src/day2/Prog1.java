package day2;
import java.util.Scanner;

/*WAP to check day type:
 If input is valid day 
     if saturday or sunday -> weekend
     else -> weekday
 else -> invalid day
 */
 
public class Prog1 {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String day = sc.nextLine();
		if(day.equals("Saturday")|| day.equals("Sunday"))
		{
			System.out.println("Weekend");
		}else if(day.equals("Monday")||day.equals("Tuesday")||day.equals("Wednesday")||day.equals("Thursday")||day.equals("Friday"))
		{
			System.out.println("Weekday");
		}else {
			System.out.println("Invalid day");
		}
	}
}

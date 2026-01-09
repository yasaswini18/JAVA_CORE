package day2;

//WAP to print message for fruits apple,mango,banana,orange and for others message should be no information
import java.util.Scanner;
public class Prog3 {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String fruit = sc.nextLine();
		switch(fruit)
		{
		case "apple" :
			System.out.println("Apples are rich in fibre and vitamin c");
		    break;
		case "banana":
			System.out.println("Bananas are a great source of potassium");
			break;
		case "mango":
			System.out.println("Mangoes are the king of fruits");
			break;
		case "orange":
			System.out.println("Oranges are packed with vitamin c");
			break;
		default:
			System.out.println("Sorry, I dont have information about that fruit");
		}
	}
}

package day14;

import java.util.Scanner;

public class ThrowAndThrows {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		try
		{checkAge(age);}
		catch(InvalidAgeException e)
		{
//			e.printStackTrace();
			System.out.println("Handled");
		}
		finally {
			sc.close();
		}
		
	}
	public static void checkAge(int age) throws InvalidAgeException{
		if(age>=18) {
			System.out.println("Eligible");
		}else {
			throw new InvalidAgeException("Not Eligible under 18");
		}
	}

}
class InvalidAgeException extends Exception{
	InvalidAgeException(String msg)
	{
		System.out.println(msg);
	}
}
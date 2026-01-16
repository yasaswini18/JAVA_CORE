package day14;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = a/b;
			String s = null;
			System.out.println(c);
			System.out.println(s); //prints null
			System.out.println(s.length()); //trying to access length of a string which is null
		}
		catch(ArithmeticException ae)
		{
//			ae.printStackTrace();
			System.out.println("Handled");
		}
		catch(InputMismatchException ie)
		{
			ie.printStackTrace();
			System.out.println("Handled");
		}
		catch(NullPointerException ne)
		{	
//			ne.printStackTrace();
			System.out.println("Handled");
		}
		
		try{
			Animal a = new Animal();
			Dog d = (Dog)a;   //trying to cast a which is of type animal at runtime 
		}catch(ClassCastException ce) {
			ce.printStackTrace();
			System.out.println("Handled");
		}
		
		finally {
			System.out.println("Executed Finally");
			sc.close();
		}
	}

}
class Animal{
	
}
class Dog extends Animal{
	
}


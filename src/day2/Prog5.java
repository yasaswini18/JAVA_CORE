package day2;
import java.util.Scanner;

/*WAP TO PERFORM ARTIHMETIC OPERATIONS USING SWITCH AND USER CHOICE
 * addition add 2 variable
 *          add 3 variable
 *          add 4 variable
 * subtraction sub 2 variable
 *          sub 3 variable
 *          sub 4 variable
 *multiplication mul 2 variable
 *          mul 3 variable
 *          mul 4 variable
 *division divide 2 variable
*/
public class Prog5 {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the operation you want to perform : ");
		String op = sc.nextLine().toLowerCase();
		System.out.println("Enter the number of values: ");
		int n = sc.nextInt();
		System.out.println("Enter the values : ");
		switch(op)
		{
		case "addition":
			int add=0;
			for(int i=1;i<=n;i++)
			{
				add+=sc.nextInt();
			}
			System.out.println("Addition of "+n+" values is "+add);
			break;
		case "subtraction":
			int sub=0;
			for(int i=1;i<=n;i++)
			{
				sub-=sc.nextInt();
			}
			System.out.println("Subtraction of "+n+" values is "+sub);
			break;
		case "multiplication":
			int mul=1;
			for(int i=1;i<=n;i++)
			{
				mul*=sc.nextInt();
			}
			System.out.println("Multiplication of "+n+" values is "+mul);
			break;
		case "division":
			int a = sc.nextInt();
			int b = sc.nextInt();
			int div = a/b;
			System.out.println("division of "+n+" values is "+div);
			break;
		}
		
		
	}
}

package day5;
/*
 * Loan Payable Amount Calculation

Question Description
A bank wants to compute the payable loan amount under different interest structures.
Implement overloaded methods named loan to calculate the final payable amount based on the provided inputs.

Overloads Required
double loan(double principal)
double loan(double principal, int years)
double loan(double principal, int years, String loanType)

Rules
Base Interest
	Default interest is 8% simple interest when only principal is provided.
With Years
	When years are provided, interest is compounded annually at 10%.
With Loan Type
	HOME → compound annually at 7%
	AUTO → compound annually at 9%
	PERSONAL → compound annually at 12%
	
Hardcoded Data Set to Use
	Principal = 200000
	Years = 5
	Loan Type = "HOME"
	
Expected Output
	HOME loan compound rate = 7%
	Amount = 200000 * (1.0.07)^5 = 280510.35
 */
public class Methods1 {
	public static void main(String[] args)
	{
		double principal = 200000;
		int years = 5;
		String loanType = "HOME";
		double amount = loan(principal, years, loanType);
		System.out.printf("Amount = %.2f",amount);
	}
	public static double loan(double principal)
	{
		return principal*8/100;
	}
	public static double loan(double principal,int years)
	{
			double compound=principal*years*10/100;
		return compound;
	}
	public static double loan(double principal,int years,String loanType)
	{
		double amount=0;
		if(loanType.equals("HOME"))
		{
			amount= principal*(Math.pow(1+0.07,years));
			System.out.println(loanType+" loan compound rate = 7%");
			
			
		}else if(loanType.equals("AUTO")) {
			amount= principal*(Math.pow(1+0.09,years));
			System.out.println(loanType+" loan compound rate = 9%");
			
			
		}else
		{
			amount= principal*(Math.pow(1+0.12,years));
			System.out.println(loanType+" loan compound rate = 12%");
			
		}
		return amount;
	}
	
	

}

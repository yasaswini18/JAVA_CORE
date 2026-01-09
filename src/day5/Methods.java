package day5;

/*
 * Savings Prediction Calculation
Question Description
A finance app predicts savings based on monthly income and expense habits.
Implement overloaded methods named predict to calculate the expected savings.
Methods
	double predict(double income, double expenses)
	double predict(double income, double expenses, boolean festiveMonth)
Rules
	Base Savings = income − expenses
	Festive Month → expenses increase by 20%
Hardcoded Data Set to Use
	Income = 45000
	Expenses = 30000
	Festive Month = true

Expected Output
	Festive expenses = 36000
	Savings = 9000
 */
public class Methods {
	public static void main(String[] args) 
	{
		double income = 45000;
		double expenses = 30000;
		boolean festiveMonth = true;
//		System.out.printf("Base Savings = %.0f",predict(income,expenses));
//		System.out.println();
		System.out.printf("Saving = %.0f",predict(income,expenses,festiveMonth));
		
	}
	public static double predict(double income,double expenses)
	{
		double baseSavings = income - expenses;
		return baseSavings;
		
	}
	public static double predict(double income,double expenses,boolean festiveMonth)
	{
		expenses = expenses + expenses*20/100;
		System.out.printf("Festive expenses = %.0f",expenses);
		System.out.println();
		double Savings = income - expenses;
		return Savings;
		
	}
	

}

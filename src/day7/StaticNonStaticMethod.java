package day7;
/*
 *  Write a Java class named BankAccount that meets the following requirements:
1. Static Variable : 
interestRate (a static variable) representing the common interest rate for all accounts. Initialize it to 5.0%.

2. Non-Static Variable : 
balance (a non-static variable) representing the account balance. Each account starts with $1000.

3. Static Method : 
updateInterestRate(double newRate): A static method to update the interestRate for all accounts.

4. Non-Static Methods
- deposit(double amount): Adds money to the account balance.
- withdraw(double amount): Deducts money from the account if sufficient funds exist. 
Otherwise, display "Insufficient funds!".
- displayAccountInfo(): Displays the account's balance and the current interest rate.

5. Main Method :
- Create two bank accounts (acc1, acc2).
- Update the interest rate using the static method.
- Perform deposit and withdrawal operations on both accounts.
- Display the account details after transactions.
 */

public class StaticNonStaticMethod {
	public static void main(String[] args) {
		BankAccount acc1 = new BankAccount(90000);
//		BankAccount acc2 = new BankAccount(50000);
		BankAccount.updateInterestRate(10);
		acc1.deposit(3000);
		acc1.withDraw(1000000);
		acc1.displayAccountInfo();
		
				
	}

}
 class BankAccount{
	static double interestRate = 5.0;
	double balance = 1000;
	BankAccount(double balance)
	{
		this.balance=balance;
	}
	public static void updateInterestRate(double newRate) {
		interestRate = newRate;
	}
	public void deposit(double amount) {
		balance = balance + amount;
	} 
	public void withDraw(double amount) {
		if(balance>amount)
		balance = balance - amount;
		else 
			System.out.println("Insufficient funds");
	}
	public void displayAccountInfo() {
		System.out.println("Account Balance: "+balance);
		System.out.println("Current Interest Rate: "+interestRate);
	}
	
	
}

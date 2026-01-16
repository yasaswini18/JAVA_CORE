//package day16;
///*
// * Banking System (Main Question)
//
//- Create an interface BankOperations with methods deposit(), withdraw(), and checkBalance().
//
//- Create an abstract class Account with encapsulated fields accountNo, holderName, and balance.
//
//- Create SavingsAccount and CurrentAccount classes (extend Account and implement BankOperations).
//
//- Store multiple accounts in an ArrayList<Account>.
//
//Demonstrate runtime polymorphism while performing operations.
//	Add features:
//	Add a new account
//	Remove an account by account number
//	Search for an account
//	Display all accounts
//	Deposit/Withdraw money into/from a chosen account
// */
//public class Iterators {
//
//}
//interface BankOperations{
//	void deposit(double money);
//	void withdraw();
//	void checkBalance();
//}
//abstract class Account {
//	private String accountNo;
//	private String holderName;
//	private double balance;
//	Account(String accountNo,String holderName,double balance){
//		this.accountNo=accountNo;
//		this.holderName=holderName;
//		this.balance=balance;
//	}
//	public String getAccountNo()
//	{
//		return accountNo;
//	}
//	public String getHolderName()
//	{
//		return holderName;
//	}
//	public double getBalance()
//	{
//		return balance;
//	}
//}
//class SavingsAccount extends Account implements BankOperations{
//	double bal;
//	SavingsAccount(String accountNo,String holderName,double balance)
//	{
//		super(accountNo,holderName,balance);
//	}
//	public void deposit(double money)
//	{
//		bal = super.getBalance();
//		bal+=money;
//	}
//	public void withdraw(double money)
//	{
//		bal-=money;
//	}
//	public void checkBalance()
//	{
//		if(bal>=0) {
//			System.out.println();
//		}
//	}
//}
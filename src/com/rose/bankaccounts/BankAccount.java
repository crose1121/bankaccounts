package com.rose.bankaccounts;
import java.util.Random;

public class BankAccount {
	
	//member variables
	private double checkingBalance;
	private double savingsBalance;
	private long accountNumber;
	
	
	//static variables
	private static int numberOfAccounts;
	private static double allAccountsBalance;
	
	
	//constructor
	//the constructor below will always point to the overloaded constructor on line 23 with the default values on line 20
	public BankAccount() {
		this(0.0,0.0,BankAccount.generateAccountNumber());
	}
	//loaded constructor
	public BankAccount(double checkingBalance, double savingsBalance, long accountNumber) {
		this.checkingBalance = checkingBalance;
		this.savingsBalance = savingsBalance;
		this.accountNumber = accountNumber;
		numberOfAccounts += 1;
	}
	
	
	//getters
	public double getCheckingBalance() {
		return checkingBalance;
	}
	

	public double getSavingsBalance() {
		return savingsBalance;
	}
	
	public long getAccountNumber() {
		return accountNumber;
	}
	
	
	//object methods
	
	//to make deposits
	public void makeDeposit(String account, double amount) {
		if (account=="checking") {
			this.checkingBalance += amount;
			allAccountsBalance += amount;
			System.out.println("Successfully deposited to checking");
		}
		else if (account=="savings"){
			this.savingsBalance += amount;
			allAccountsBalance += amount;
			System.out.println("Successfully deposited to savings");
		}
		else {System.out.println("Please specify checking or savings");}
	}
	
	//to make withdrawals
	public void makeWithdrawal(String account, double amount) {
		if (account=="checking") {
			if(this.checkingBalance>=amount) {
				this.checkingBalance -= amount;
				System.out.printf("Withdrawal successful. Remaining checking balance: $%s",this.checkingBalance);
				allAccountsBalance -= amount;
			}
			else {System.out.println("Insufficient Funds");}
		}
		else if (account=="savings") {
			if (this.savingsBalance>=amount) {
				this.savingsBalance -= amount;
				System.out.printf("Withdrawal successful. Remaining savings balance: $%s",this.savingsBalance);
				allAccountsBalance -= amount;
			}
			else {System.out.println("Insufficient Funds");}
		}
		else {System.out.println("Please specify checking or savings");}
	}
	
	//to display both balances for 1 account
	public String displayAccountBalances() {
		return String.format("Remaining balances\nChecking: $%s\nSavings: $%s",this.checkingBalance,this.savingsBalance);
	}
	
	//to display total balance of all accounts in the bank
	public static void displayAllAccountsBalance() {
		System.out.println(allAccountsBalance);
	}
	//to display number of accounts in the bank
	public static void displayNumberOfAccounts() {
		System.out.println(numberOfAccounts);
	}
	
	//private method to return a random 10 digit number
	private static long generateAccountNumber() {
		long accountNumber = (long) Math.floor(Math.random() * 9_000_000_000L) + 1_000_000_000L;
		return accountNumber;
	}
	


	
}

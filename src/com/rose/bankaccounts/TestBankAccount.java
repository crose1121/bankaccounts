package com.rose.bankaccounts;

public class TestBankAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount account1 = new BankAccount();
		BankAccount account2 = new BankAccount();
		
		//test get checking and savings
//		System.out.println(account1.getCheckingBalance());
//		System.out.println(account2.getCheckingBalance());
//		
//		System.out.println(account1.getSavingsBalance());
//		System.out.println(account2.getSavingsBalance());
		
		//test make deposit method
		account1.makeDeposit("checking", 500);
		account2.makeDeposit("savings", 550);
		account1.makeDeposit("savings", 150);
		account2.makeDeposit("checking", 150);
		account1.makeDeposit("savings", 750);
		account2.makeDeposit("checking", 570);
		
//		System.out.println(account1.getCheckingBalance());
//		System.out.println(account2.getCheckingBalance());
//		
//		System.out.println(account1.getSavingsBalance());
//		System.out.println(account2.getSavingsBalance());
		
		//test validations for spelling
		account1.makeDeposit("checkig", 50);
		
		// test withdrawal
		account2.makeWithdrawal("savings", 50);
//		System.out.println(account2.getSavingsBalance());
		
		//test display balances
		System.out.println(account1.displayAccountBalances());
		System.out.println(account2.displayAccountBalances());
		
		
		//test displayAllAccountsBalance()
		BankAccount.displayAllAccountsBalance();
		
		//test displayNumberOfAccounts()
		BankAccount.displayNumberOfAccounts();
		
		//test getAccountNumber()
		System.out.println("This is the account number: " + account1.getAccountNumber());
		System.out.println(account1.getAccountNumber());
	}

}

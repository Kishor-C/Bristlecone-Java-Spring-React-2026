package com.bristlecone;

public class TestPolymorphism {
	public static void main(String[] args) {
		Account account1 = new Account(12345, 5000);
		SavingsAccount account2 = new SavingsAccount(98765, 5000);
		FixedDepositAccount account3 = new FixedDepositAccount(567899, 50000);
		printInterest(account1);
		printInterest(account2);
		printInterest(account3);
		
		Account[] acc = new Account[3];
		acc[0] = account1;
		acc[1] = account2;
		acc[2] = account3;
		
		for(Account a : acc) { // a = account1 = new SavingsAccount();
			a.applyInterest();
			if(a instanceof SavingsAccount) {
				SavingsAccount sa = (SavingsAccount) a; // LT = (LT) HT;   SavingsAccount sa = new Account();
				sa.applyCharges();
			}
		}
		
	}
	// Account class is super class for Savings and FixedDeposit
	public static void printInterest(Account account) { // Account account = new SavingsAccount(); // SA, Account
		account.applyInterest(); // runtime polymorphism
		System.out.println("________________________");
		
	}
}/*
	// update stipend by calling setStipend while iterating
	for(Employee emp: employees) {
		// call setStipend(25000);
		employees[2].setStipend(25000); // it gives compilation error
		if(emp instanceof InternEmployee) {  // checks if iterated element is of InternEmployee type
			InternEmployee intern = (InternEmployee)emp;
			intern.setStipend(25000);
		}
	}

*/



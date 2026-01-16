package com.bristlecone;

public class SavingsAccount extends Account {

	public SavingsAccount(int accountNumber, double balance) {
		super(accountNumber, balance);
	}

	@Override
	public double applyInterest() {
		System.out.println("applyInterest() in Savings Account class");
		return 0.05;
	}
	
	public void applyCharges() {
		System.out.println("applyCharges() in SavingsAccount");
	}
}

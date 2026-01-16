package com.bristlecone;

public class FixedDepositAccount extends Account {

	public FixedDepositAccount(int accountNumber, double balance) {
		super(accountNumber, balance);
	}

	@Override
	public double applyInterest() {
		System.out.println("applyInterest() in Fixed Deposit Account class");
		return 0.08;
	}
}

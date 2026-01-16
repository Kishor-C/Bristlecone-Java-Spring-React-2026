package com.bristlecone;

public class Account {
	private int accountNumber;
	private double balance;
	
	public Account(int accountNumber, double balance) {
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	
	public double applyInterest() {
		System.out.println("applyInterest()  in Account class");
		return 0.0;
	}
	
	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
}

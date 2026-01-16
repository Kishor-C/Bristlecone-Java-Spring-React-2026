package com.bristlecone;

enum Gender { 
	MALE, FEMALE
}
enum LoanType {
	CAR, HOME, PERSONAL, EDUCATIONAL, BUSINESS
}
class Customer {
	private String name;
	private Gender gender;
	private LoanType loanType;
	
	public Customer(String name, Gender gender, LoanType loanType) {
		this.name = name;
		this.gender = gender;
		this.loanType = loanType;
	}
	public void display() {
		System.out.println("Name="+name+",Gender="+gender+",Loan Type="+loanType);
	}
}

public class TestEnums {
	public static void main(String[] args) {
		Customer customer1 = new Customer("Alex", Gender.MALE, LoanType.PERSONAL);
		Customer customer2 = new Customer("Priya", Gender.FEMALE, LoanType.EDUCATIONAL);
		customer1.display();
		customer2.display();
		// use values() of enum and try to print all the values using for-loop
	}
}

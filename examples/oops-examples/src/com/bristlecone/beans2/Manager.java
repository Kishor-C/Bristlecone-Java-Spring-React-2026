package com.bristlecone.beans2;

import com.bristlecone.beans.Employee;

public class Manager extends Employee {
	public Manager(String name, double salary) {
		super(name, salary);
	}
	
	public void display() {
		// you can access getSalary() 
		System.out.println("Salary = "+getSalary());
	}
	protected void getEmployeeDetails() {
		System.out.println("--- Manager.getEmployeeDetails() ---");
	}
}

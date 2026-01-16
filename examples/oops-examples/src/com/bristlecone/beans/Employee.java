package com.bristlecone.beans;

public class Employee {
	private String name;
	private double salary;
	
	public Employee(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}

	String getName() {
		return name;
	}

	protected double getSalary() {
		return salary;
	}

}

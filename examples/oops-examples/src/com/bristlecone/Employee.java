package com.bristlecone;

import java.time.LocalDate;

public class Employee extends Person {
	private int id;
	private String desig;
	private double salary;
	public Employee() {
		super();
		System.out.println("Employee()");
	}
	public Employee(int id, String name, LocalDate dob, String gender, String desig, double salary) {
		super(name, dob, gender); // Person(String, LocalDate, String)
		this.id = id;
		this.desig = desig;
		this.salary = salary;		
		System.out.println("Employee(int, String, LocalDate, String, String, double)");
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDesig() {
		return desig;
	}
	public void setDesig(String desig) {
		this.desig = desig;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
}

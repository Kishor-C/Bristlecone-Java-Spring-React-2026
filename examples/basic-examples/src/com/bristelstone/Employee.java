package com.bristelstone;

public class Employee {
	private int id;
	private String name;
	private double[] monthlySalaries = new double[3];
	private static int counter = 0;
	
	public Employee() {
		name = "Unknown";
		counter++;
	}
	public Employee(int id, String name, double[] monthlySalaries) {
		this.id = id;
		this.name = name;
		this.monthlySalaries = monthlySalaries;
		counter++;
	}
	// setters and getters
	public static int getEmployeeCount() {
		return counter;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public double calculateAverage() {
		double sum = 0;
		for(double salary : monthlySalaries) {
			sum = sum + salary;
		}
		return sum / monthlySalaries.length;
	}
	public void display() {
		System.out.println("Id = "+id+", Name = "+name);
		System.out.println("3 months salary:-");
		for(double salary : monthlySalaries) {
			System.out.println(salary);
		}
		System.out.println("Average salary = "+calculateAverage());
		System.out.printf("Average salary: %.2f %n", calculateAverage());
	}
}

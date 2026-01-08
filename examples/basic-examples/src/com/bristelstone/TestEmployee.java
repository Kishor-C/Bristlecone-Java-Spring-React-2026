package com.bristelstone;

public class TestEmployee {
	public static void main(String[] args) {
		Employee emp1 = new Employee(100, "Vijay", new double[] {5000.0, 6000.0, 5000.0});
		emp1.setName("Vijay Kumar");
		System.out.println("Employee id is: "+emp1.getId());
		emp1.display();
		Employee emp2 = new Employee();
		emp2.display();
		System.out.println("Employee count: "+Employee.getEmployeeCount());
		
		emp1.display();
	}
}

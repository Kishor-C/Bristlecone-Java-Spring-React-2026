package com.bristlecone;

import java.time.LocalDate;


public class TestInheritance {
	public static void main(String[] args) {
		Employee emp1 = new Employee();
		System.out.println("----------------------");
		Employee emp2 = new Employee(1234, "Alex", LocalDate.parse("2002-10-15"), "Male", "Manager", 99973473L);
		System.out.println("Employee1 informations");
		System.out.println("Name = "+emp1.getName()+", Desig = "+emp1.getDesig());
		System.out.println("Employee2 informations");
		System.out.println("Name = "+emp2.getName()+", Desig = "+emp2.getDesig());
	}
}

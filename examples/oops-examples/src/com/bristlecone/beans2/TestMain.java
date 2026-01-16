package com.bristlecone.beans2;

public class TestMain {
	public static void main(String[] args) {
		Manager m = new Manager("Raj", 352000);
		m.display();
		// you can't directly access getSalary from the object
		m.display();
		
	}
}

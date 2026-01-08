package com.bristelstone;

public class User {
	int userId; // instance variables 
	String name; // instance variables 
 	long phone;  // instance variables
 	
 	// constructor that takes parameters
 	public User(int userId, String name) {
 		this.userId = userId;
 		this.name = name;
 		System.out.println("User(int, String)");
 	}
 
  	public User(int userId, String name, long phone) {
  		this(userId, name); // User(int, String)
  		this.phone = phone;
  		System.out.println("User(int, String, long)");
  	}
 	// method to print the user information
 	void display() {
 		System.out.println("User Id = "+userId);
 		System.out.println("Name = "+name);
 		System.out.println("Phone = "+((phone != 0) ? phone : "Not Available"));
 	}
}

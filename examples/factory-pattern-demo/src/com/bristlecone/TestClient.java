package com.bristlecone;

import java.util.Scanner;

public class TestClient {
	public static void main(String[] args) {
		/*
		 * Client will not have idea they are using which UserService implementation
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of users you want to add");
		int size = scan.nextInt();
		// UserService service2 = new UserServiceImpl();
		// loosely coupled
		UserService service = UserFactory.getInstance(size);
		for(int i = 0; i < size; i++) {
			System.out.println("Enter name:");
			String name = scan.next(); // one word
			System.out.println("Enter age:");
			int age = scan.nextInt();
			User user = new User(name, age);
			// store in the array 
			service.store(user);
		}
		//search by name
		System.out.println("Enter name to search user:");
		String name = scan.next();
		User user = service.findByName(name);
		System.out.println(user != null ? "User "+name+" found" : "User not found");
		// display all users
		User[] users = service.findAll();
		for(User u : users)
			System.out.println("Name = "+u.getName()+", Age = "+u.getAge());
		// close the scanner
		scan.close();
	}
}

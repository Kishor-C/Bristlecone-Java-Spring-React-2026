package com.bristelstone;

public class TestUser {
	public static void main(String[] args) {
		// User() is a constructor
		User user1 = new User(100, "Alex", 987654321L); // [userId=100,name=Alex,phone=987654321]
		System.out.println("---------------------------------");
		User user2 = new User(200, "Brad");// [userId=200,name=Brad,phone=987655678L]
		
		user1.display();
		System.out.println("---------------------------");
		user2.display();
	}
}

package com.bristlecone;

import java.time.LocalDate;

public class Person {
	private String name;
	private LocalDate dob; // ISO date format - yyyy/MM/dd
	private String gender;
	public Person() {
		System.out.println("Person() constructor");
	}
	public Person(String name, LocalDate dob, String gender) {
		this.name = name;
		this.dob = dob;
		this.gender = gender;
		System.out.println("Person(String, LocalDate, String)");
	}
	// setters and getters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
}

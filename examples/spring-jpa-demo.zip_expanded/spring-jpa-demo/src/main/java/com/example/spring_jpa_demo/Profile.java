package com.example.spring_jpa_demo;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/*
 * JPA treats table name & class name same
 * Spring boot knows its should connect to DB using application.propertes
 */
@Entity
public class Profile {

	@Id // primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int profileId;
	
	private String name;
	
	private long phone;
	
	private LocalDate dob;

	public int getProfileId() {
		return profileId;
	}

	public void setProfileId(int profileId) {
		this.profileId = profileId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	
	
}

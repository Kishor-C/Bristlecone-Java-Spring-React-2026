package com.example.spring_jpa_demo;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;

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
	
	private String password;
	
	private long phone;
	
	private LocalDate dob;
	
	// this annotation joins profile & contact table
	// using the primary key & foreign key values
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "profileref")
	private List<Contact> contactList;
	

	public List<Contact> getContactList() {
		return contactList;
	}

	public void setContactList(List<Contact> contactList) {
		this.contactList = contactList;
	}

	public int getProfileId() {
		return profileId;
	}

	public void setProfileId(int profileId) {
		this.profileId = profileId;
	}

	public String getName() {
		return name;
	}
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
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

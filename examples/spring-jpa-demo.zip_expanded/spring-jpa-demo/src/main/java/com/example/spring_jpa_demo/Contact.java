package com.example.spring_jpa_demo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Contact {
	
	@Id // primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int contactId;
	
	private String name;
	
	private long phone;
	
	// foreign key column
	private int profileref;

	public int getContactId() {
		return contactId;
	}

	public void setContactId(int contactId) {
		this.contactId = contactId;
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

	public int getProfileref() {
		return profileref;
	}

	public void setProfileref(int profileref) {
		this.profileref = profileref;
	}
	
}

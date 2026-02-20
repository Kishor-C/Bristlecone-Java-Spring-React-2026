package com.example.spring_jpa_demo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ContactRepo extends JpaRepository<Contact, Integer>{
	
	@Query("select c from Contact c where c.profileref=?1 and c.name like concat(?2, '%')")
	public List<Contact> filterContacts(int profileId, String name);
	
}

package com.example.spring_jpa_demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/*
 * Service layer will have business logics
 * This object is created by spring container,
 * hence we use @Servcie
 */
@Service
public class ProfileService {

	/*
	 * Spring container injects DAO layer object
	 * this object class is auto-implemented by spring boot
	 */
	@Autowired
	private ProfileRepo profileDao;
	
	/*
	 * there are built-in methods like save(T), findAll
	 * to store & retrieve 
	 */
	// save method saves an entity and returns the saved entity
	// if id is auto-generated you can view that id
	@Transactional // required when you save, delete, update
	public Profile createProfile(Profile profile) {
		return profileDao.save(profile);
	}
	// findAll method returns all the entities in a List
	public List<Profile> fetchProfiles() {
		return profileDao.findAll();
	}
	
	
}

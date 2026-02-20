package com.example.spring_jpa_demo;

import java.util.List;
import java.util.Optional;

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
	
	@Autowired
	private ContactRepo contactDao;
	
	/*
	 * Filter the contacts based on the profile id and name pattern
	 */
	public List<Contact> fetchContactsByName(int profileId, String name) {
		return contactDao.filterContacts(profileId, name);
	}
	/*
	 * 
	 * Add contact to a particular profile
	 * 
	 */
	@Transactional
	public Contact saveContact(Contact contact, int profileId) {
		contact.setProfileref(profileId);
		return contactDao.save(contact);
	}
	
	
	/*
	 * there are built-in methods like save(T), findAll
	 * to store & retrieve 
	 */
	// authenticate method that accepts id and password
	public Profile authenticate(int profileId, String password) throws ProfileNotFoundException {
		Optional<Profile> option = profileDao.login(profileId, password);
		return option.orElseThrow(() -> new ProfileNotFoundException("Id or Password is incorrect"));
	}
	// findById that 
	public Profile fetchProfile(int id) throws ProfileNotFoundException {
		// findById returns Optional, some methods it has orElse, orElseThrow, isPresent
		Optional<Profile> option = profileDao.findById(id);
		return option.orElseThrow(()->new ProfileNotFoundException("Profile not found for an id "+id));
	}
	// delete by id
	@Transactional
	public void deleteProfile(int id) throws ProfileNotFoundException {
		Profile p = fetchProfile(id);
		profileDao.delete(p);
	}
	
	// update profile based on the id
	@Transactional
	public Profile updateProfile(int id, Profile profile) throws ProfileNotFoundException{
		Profile p = fetchProfile(id);
		if(profile.getPhone() != 0) {
			p.setPhone(profile.getPhone());
		}
		if(profile.getName() != null) {
			p.setName(profile.getName());
		}
		if(profile.getDob() != null) {
			p.setDob(profile.getDob());
		}
		return p;
	}
	
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

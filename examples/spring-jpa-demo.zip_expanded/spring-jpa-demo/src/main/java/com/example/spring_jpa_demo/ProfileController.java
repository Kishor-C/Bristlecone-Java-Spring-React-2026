package com.example.spring_jpa_demo;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ProfileController {

	@Autowired
	private ProfileService profileService;
	
	// fetch contacts based on profile id and name
	// when the path parameter name and method parameter name same, 
	//then using parameter name in the path variable is optional
	@GetMapping(path = "/profile/{id}/contact/{name}")
	public ResponseEntity<Object> findContactsByName(@PathVariable int id, @PathVariable String name) {
		List<Contact> list = profileService.fetchContactsByName(id, name);
		return ResponseEntity.status(200).body(list);
	}
	
	
	// accept the JSON data & pass it to the createProfile
	
	@PostMapping(path = "/profile")
	public ResponseEntity<Object> saveProfile(@RequestBody Profile profile) {
		Profile createdProfile = profileService.createProfile(profile);
		return ResponseEntity.status(200).body(createdProfile);
	}
	
	// login will accept profile in JSON but it will have only id and password
	@PostMapping(path = "/profile/login")
	public ResponseEntity<Object> login(@RequestBody Profile profile) {
		try {
			Profile p = profileService.authenticate(profile.getProfileId(), profile.getPassword());
			return ResponseEntity.status(200).body(p);
		} catch(ProfileNotFoundException e) {
			Map<String, String> map = Map.of("message", e.getMessage());
			return ResponseEntity.status(404).body(map);
		}
	}
	// add contact to a particular profile
	@PostMapping(path = "/profile/contact/{id}")
	public ResponseEntity<Object> createContact(@RequestBody Contact contact, @PathVariable("id") int profileId) {
		Contact createdContact = profileService.saveContact(contact, profileId);
		return ResponseEntity.status(200).body(createdContact);
	}
	
	// return all the profiles in JSON 
	@GetMapping(path = "/profile")
	public ResponseEntity<Object> findProfiles() {
		List<Profile> profiles = profileService.fetchProfiles();
		return ResponseEntity.status(200).body(profiles);
	}
	// /return the profile or error in JSON
	@GetMapping(path = "/profile/{id}")
	public ResponseEntity<Object> findProfile(@PathVariable("id") int profileId) {
		try {
			Profile profile = profileService.fetchProfile(profileId);
			return ResponseEntity.status(200).body(profile);
		} catch(ProfileNotFoundException e) {
			Map<String, String> map = Map.of("message", e.getMessage());
			return ResponseEntity.status(404).body(map);
		}
	}
	// deleting the profile based on id
	@DeleteMapping(path = "/profile/{id}")
	public ResponseEntity<Object> removeProfile(@PathVariable("id") int profileId) {
		try {
			profileService.deleteProfile(profileId);
			return ResponseEntity.status(200).body("Profile delete successfully");
		} catch(ProfileNotFoundException e) {
			Map<String, String> map = Map.of("message", e.getMessage());
			return ResponseEntity.status(404).body(map);
		}
	}
	// this updates the profile based on the id
	@PutMapping(path = "/profile/{id}")
	public ResponseEntity<Object> editProfile(@PathVariable("id") int profileId, @RequestBody Profile profile) {
		try {
			Profile p = profileService.updateProfile(profileId, profile);
			return ResponseEntity.status(200).body(p);
		} catch(ProfileNotFoundException e) {
			Map<String, String> map = Map.of("message", e.getMessage());
			return ResponseEntity.status(404).body(map);
		}
	}
}

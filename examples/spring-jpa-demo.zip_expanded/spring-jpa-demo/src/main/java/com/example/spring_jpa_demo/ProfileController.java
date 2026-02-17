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
	
	// accept the JSON data & pass it to the createProfile
	
	@PostMapping(path = "/profile")
	public ResponseEntity<Object> saveProfile(@RequestBody Profile profile) {
		Profile createdProfile = profileService.createProfile(profile);
		return ResponseEntity.status(200).body(createdProfile);
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

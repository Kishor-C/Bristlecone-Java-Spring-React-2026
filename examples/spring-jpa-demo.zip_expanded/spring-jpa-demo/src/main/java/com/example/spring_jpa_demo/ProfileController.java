package com.example.spring_jpa_demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
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
}

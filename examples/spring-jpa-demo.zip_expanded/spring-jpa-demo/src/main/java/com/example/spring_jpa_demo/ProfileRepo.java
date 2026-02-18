package com.example.spring_jpa_demo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ProfileRepo extends JpaRepository<Profile, Integer>{
	// we don't have built in method to check for id and password
	// we will write JPQL which queries the entity since it may or may not match we return Optional
	@Query("select p from Profile p where p.profileId=?1 and p.password=?2")
	public Optional<Profile> login(int profileId, String password);
}

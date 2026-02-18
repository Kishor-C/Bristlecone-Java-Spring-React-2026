package com.example.spring_jpa_demo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRepo extends JpaRepository<Contact, Integer>{

}

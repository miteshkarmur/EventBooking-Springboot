package com.mitesh.EventRegistration.service;

import java.util.Optional;

import com.mitesh.EventRegistration.entity.People;

public interface PeopleService {

	public Optional<People> getPeopleByEmail(String emailId);
	
}

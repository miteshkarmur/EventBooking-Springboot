package com.mitesh.EventRegistration.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mitesh.EventRegistration.entity.People;
import com.mitesh.EventRegistration.repository.PeopleRepo;
@Service
public class PeopleServiceImpl implements PeopleService {

	@Autowired
	PeopleRepo peopleRepo;
	
	@Override
	public Optional<People> getPeopleByEmail(String emailId) {
		return peopleRepo.findById(emailId);
	}

}

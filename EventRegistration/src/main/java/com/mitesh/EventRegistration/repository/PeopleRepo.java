package com.mitesh.EventRegistration.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mitesh.EventRegistration.entity.People;

@Repository
public interface PeopleRepo extends JpaRepository<People, String> {

}

package com.mitesh.EventRegistration.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mitesh.EventRegistration.entity.City;
@Repository
public interface CityRepo extends JpaRepository<City, Integer> {

}

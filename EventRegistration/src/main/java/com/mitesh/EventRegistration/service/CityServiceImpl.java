package com.mitesh.EventRegistration.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mitesh.EventRegistration.entity.City;
import com.mitesh.EventRegistration.repository.CityRepo;
@Service
public class CityServiceImpl implements CityService {

	@Autowired
	CityRepo cityRepo;
	
	@Override
	public List<City> getAllCities() {
		return cityRepo.findAll();
	}

	@Override
	public City getCitybyId(Integer citiId) {
		return cityRepo.findById(citiId).get();
	}

}

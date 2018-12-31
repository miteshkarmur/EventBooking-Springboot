package com.mitesh.EventRegistration.service;

import java.util.List;

import com.mitesh.EventRegistration.entity.City;

public interface CityService {

	public List<City> getAllCities();

	public City getCitybyId(Integer citiId);

	

}

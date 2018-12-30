package com.mitesh.EventRegistration.entity;

import java.time.LocalDateTime;
import java.util.List;

public class City {

	private int code;
	private String name;
	
	private List<Slot> slots;
	
	public City() {
		
	}
	
	public City(int code, String name) {
		this.code = code;
		this.name = name;
	}
	
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public List<Slot> getSlots() {
		return slots;
	}

	public void setSlots(List<Slot> slots) {
		this.slots = slots;
	}
	
	
}

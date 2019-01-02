package com.mitesh.EventRegistration.entity;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table
public class People {

	@Id
	private String email;
	
	@Column(name="first_name")
	private String firstName;
	
	@Column(name="last_name")
	private String lastName;
	
	private LocalDate dob;
	
	@Column(name="phone_no")
	private Long phoneNo;
	
	private String city;
	
	@Column(name="lang")
	private String language;
	
	@ManyToOne
	@JoinColumn(name="slot_id")
	private Slot slot;
	
	public People() {
		
	}

	public People(String email, String firstName, String lastName, LocalDate dob, Long phoneNo, String city,
			String language, Slot slot) {
		super();
		this.email = email;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dob = dob;
		this.phoneNo = phoneNo;
		this.city = city;
		this.language = language;
		this.slot = slot;
	}

	public Slot getSlot() {
		return slot;
	}

	public void setSlot(Slot slot) {
		this.slot = slot;
	}

	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getDob() {
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
	    return dob.format(format);
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	
	public Long getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(Long phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}

	@Override
	public String toString() {
		return "People [email=" + email + ", firstName=" + firstName + ", lastName=" + lastName + ", dob=" + dob
				+ ", phoneNo=" + phoneNo + ", city=" + city + ", language=" + language + ", slot=" + slot + "]";
	}
	
	
}

package com.mitesh.EventRegistration.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
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
	
	@Column(name="date_of_interest")
	private LocalDate dateOfInterest;
	
	@Column(name="phone_no")
	private Long phoneNo;
	
	private String city;
	
	@Column(name="lang")
	private String language;
	
	@Column(name="booking_flag")
	private Boolean bookingFlag;
	
	public People() {
		
	}
	
	public People(String email, String firstName, String lastName, LocalDate dob, LocalDate dateOfInterest,
			Long phoneNo, String city, String language, Boolean bookingFlag) {
		this.email = email;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dob = dob;
		this.dateOfInterest = dateOfInterest;
		this.phoneNo = phoneNo;
		this.city = city;
		this.language = language;
		this.bookingFlag = bookingFlag;
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
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	public LocalDate getDateOfInterest() {
		return dateOfInterest;
	}
	public void setDateOfInterest(LocalDate dateOfInterest) {
		this.dateOfInterest = dateOfInterest;
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
	public Boolean getBookingFlag() {
		return bookingFlag;
	}
	public void setBookingFlag(Boolean bookingFlag) {
		this.bookingFlag = bookingFlag;
	}
	
	@Override
	public String toString() {
		return "People [email=" + email + ", firstName=" + firstName + ", lastName=" + lastName + ", dob=" + dob
				+ ", dateOfInterest=" + dateOfInterest + ", phoneNo=" + phoneNo + ", city=" + city + ", language="
				+ language + ", bookingFlag=" + bookingFlag + "]";
	}
}

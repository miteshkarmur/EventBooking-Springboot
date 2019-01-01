package com.mitesh.EventRegistration.entity;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Entity
@Table(name="slot")
public class Slot {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="slot_id")
	private Integer slotId;
	
	@Column(name="date_time")
	/*@Temporal(TemporalType.TIMESTAMP)*/
	private LocalDateTime dateTime;
	
	@Column(name="no_of_tickets")
	private Integer noOfTickets;
	
	public Slot() {

	}
	
	public Slot(Integer slotId, LocalDateTime dateTime, Integer noOfTickets) {
		this.slotId = slotId;
		this.dateTime = dateTime;
		this.noOfTickets = noOfTickets;
	}

	public String getDateTime() {
		 DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		    return dateTime.format(format);
	}
	public void setDateTime(LocalDateTime dateTime) {
		this.dateTime = dateTime;
	}
	public Integer getNoOfTickets() {
		return noOfTickets;
	}
	public void setNoOfTickets(Integer noOfTickets) {
		this.noOfTickets = noOfTickets;
	}

	public Integer getSlotId() {
		return slotId;
	}

	public void setSlotId(Integer slotId) {
		this.slotId = slotId;
	}

	@Override
	public String toString() {
		DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
		return dateTime.format(format)+"\n Tickets Left: "+noOfTickets ;
	}
	
	
}

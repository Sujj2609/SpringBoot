package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.*;

@Entity
@Table(name = "meeting_table")
public class Meetings {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private int meetingid;
	
	private String title;
	
	private String description;
	
	private LocalDate date;
	
	private LocalTime start_time;
	
	private LocalTime end_time;

	public Meetings() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Meetings(int meetingid, String title, String description, LocalDate date, LocalTime start_time,
			LocalTime end_time) {
		super();
		this.meetingid = meetingid;
		this.title = title;
		this.description = description;
		this.date = date;
		this.start_time = start_time;
		this.end_time = end_time;
	}

	public int getMeetingid() {
		return meetingid;
	}

	public void setMeetingid(int meetingid) {
		this.meetingid = meetingid;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public LocalTime getStart_time() {
		return start_time;
	}

	public void setStart_time(LocalTime start_time) {
		this.start_time = start_time;
	}

	public LocalTime getEnd_time() {
		return end_time;
	}
	public void setEnd_time(LocalTime end_time) {
		this.end_time = end_time; 
	}
}

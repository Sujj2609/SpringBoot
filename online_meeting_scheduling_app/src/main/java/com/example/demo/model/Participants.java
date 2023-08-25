package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="participants_table")
public class Participants {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private int participantid;
	
	private int meetingid;
	
	private int userid;
	
	private String Status;

	public Participants() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Participants(int participantid, int meetingid, int userid, String status) {
		super();
		this.participantid = participantid;
		this.meetingid = meetingid;
		this.userid = userid;
		Status = status;
	}

	public int getParticipantid() {
		return participantid;
	}

	public void setParticipantid(int participantid) {
		this.participantid = participantid;
	}

	public int getMeetingid() {
		return meetingid;
	}

	public void setMeetingid(int meetingid) {
		this.meetingid = meetingid;
	}

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public String getStatus() {
		return Status;
	}

	public void setStatus(String status) {
		Status = status;
	}
	
	
}

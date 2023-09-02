package com.example.demo.Models;

import jakarta.persistence.Entity;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
//import jakarta.persistence.JoinColumn;
//import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="_meeting")
public class Meeting {
	@Id
	private int id;
	
	private int hostid;
	private String topic;
	private String date;
	private int participants;
	private String duration;
	private String hostname;
	@OneToMany
    @JoinColumn(name="hostid",referencedColumnName = "id")
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getHostname() {
		return hostname;
	}
	public void setHostname(String hostname) {
		this.hostname = hostname;
	}
	public String getTopic() {
		return topic;
	}
	public void setTopic(String topic) {
		this.topic = topic;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public int getParticipants() {
		return participants;
	}
	public void setParticipants(int participants) {
		this.participants = participants;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	public int getHostid() {
		return hostid;
	}
	public void setHostid(int hostid) {
		this.hostid = hostid;
	}
	public Meeting(int id, String hostname, int hostid,String topic, String date, int participants, String duration) {
		this.id = id;
		this.hostname = hostname;
		this.hostid=hostid;
		this.topic = topic;
		this.date = date;
		this.participants = participants;
		this.duration = duration;
	}
	public Meeting(){
		
	}
	
	
	
	
}

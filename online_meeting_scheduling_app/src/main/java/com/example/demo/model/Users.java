package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "User_table")
public class Users {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private int userid;
	
	private String username;
	
	private String email;
	
	private String password;
	
	private  String timezone;

	public Users() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Users(int userid, String username, String email, String password, String timezone) {
		super();
		this.userid = userid;
		this.username = username;
		this.email = email;
		this.password = password;
		this.timezone = timezone;
	}

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getTimezone() {
		return timezone;
	}

	public void setTimezone(String timezone) {
		this.timezone = timezone;
	}
	
	
}

package com.example.demo.Models;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="host")

public class Host {
	@Id
	private int hostid;
	private String hostname;
	private long contact;
	public int getHostid() {
		return hostid;
	}
	public void setHostid(int hostid) {
		this.hostid = hostid;
	}
	public String getHostname() {
		return hostname;
	}
	public void setHostname(String hostname) {
		this.hostname = hostname;
	}
	public long getContact() {
		return contact;
	}
	public void setContact(long contact) {
		this.contact = contact;
	}
	public Host(int hostid,String hostname,long contact) {
		this.hostid=hostid;
		this.hostname=hostname;
		this.contact=contact;
	}
}

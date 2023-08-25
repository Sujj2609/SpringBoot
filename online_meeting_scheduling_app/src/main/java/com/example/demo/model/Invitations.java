package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="invitation_table")
public class Invitations {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private int invitationid;
	
	private int meetingid;
	
	private int invited_user_id;
	
	private String recipient_email;
	
	private String invitation_status;

	public Invitations() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Invitations(int invitationid, int meetingid, int invited_user_id, String recipient_email,
			String invitation_status) {
		super();
		this.invitationid = invitationid;
		this.meetingid = meetingid;
		this.invited_user_id = invited_user_id;
		this.recipient_email = recipient_email;
		this.invitation_status = invitation_status;
	}

	public int getInvitationid() {
		return invitationid;
	}

	public void setInvitationid(int invitationid) {
		this.invitationid = invitationid;
	}

	public int getMeetingid() {
		return meetingid;
	}

	public void setMeetingid(int meetingid) {
		this.meetingid = meetingid;
	}

	public int getInvited_user_id() {
		return invited_user_id;
	}

	public void setInvited_user_id(int invited_user_id) {
		this.invited_user_id = invited_user_id;
	}

	public String getRecipient_email() {
		return recipient_email;
	}

	public void setRecipient_email(String recipient_email) {
		this.recipient_email = recipient_email;
	}

	public String getInvitation_status() {
		return invitation_status;
	}

	public void setInvitation_status(String invitation_status) {
		this.invitation_status = invitation_status;
	}
	
	

}

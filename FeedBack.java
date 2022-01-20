package org.capgemini.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Feedback_form")
public class FeedBack {
	//auto generate the values of userId
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="user_id", unique=true)
	private String userId;
	@Column(name="username")
	private String username;
	@Column(name="contact_number")
	private long contactNumber;
	@Column(name="feed_back")
	private String feedBack;


	//default constructor
	public FeedBack() {
		super();

	}
	//parameterized constructor
	public FeedBack(String userId, String username, long contactNumber, String feedBack) {
		super();
		this.userId = userId;
		this.username = username;
		this.contactNumber = contactNumber;
		this.feedBack = feedBack;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public long getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(long contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String getFeedBack() {
		return feedBack;
	}
	public void setFeedBack(String feedBack) {
		this.feedBack = feedBack;
	}





}

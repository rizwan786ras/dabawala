package org.capgemini.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//creating tables
@Entity
@Table(name="Customer")
public class Customer {

	//auto generate the values of userId	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="userId")
	private String userId;
	@Column(name="username")
	private String username;
	@Column(name="contactNumber")
	private long contactNumber;
	@Column(name="help")
	private  String help;

	//default constructor 
	public Customer() {
		super();
	}

	//parameterized constructor
	public Customer(String userId, String username, long contactNumber, String help) {
		super();
		this.userId = userId;
		this.username = username;
		this.contactNumber= contactNumber;
		this.help = help;
	}

	// getter and setter method  for the parameters to set the values and read the values
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
	public String getHelp() {
		return help;
	}
	public void setHelp(String help) {
		this.help = help;
	}



}

package com.mindtree.restservice.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="resturant")
public class Resturant {

	@Id
	@Column(name="resturantID")
	private String resturantID;
	@Column(name="resturantName")
	private String resturantName;
	@Column(name="resturantAddress")
	private String resturantAddress;
	@Column(name="resturantPhonenumber")
	private String resturantPhonenumber;
	@Column(name="resturantEmail")
	private String resturantEmail;

	public String getResturantID() {
		return resturantID;
	}

	public void setResturantID(String resturantID) {
		this.resturantID = resturantID;
	}

	public String getResturantName() {
		return resturantName;
	}

	public void setResturantName(String resturantName) {
		this.resturantName = resturantName;
	}

	public String getResturantAddress() {
		return resturantAddress;
	}

	public void setResturantAddress(String resturantAddress) {
		this.resturantAddress = resturantAddress;
	}

	public String getResturantPhonenumber() {
		return resturantPhonenumber;
	}

	public void setResturantPhonenumber(String resturantPhonenumber) {
		this.resturantPhonenumber = resturantPhonenumber;
	}

	public String getResturantEmail() {
		return resturantEmail;
	}

	public void setResturantEmail(String resturantEmail) {
		this.resturantEmail = resturantEmail;
	}
	

}

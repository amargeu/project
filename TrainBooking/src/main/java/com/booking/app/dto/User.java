package com.booking.app.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User implements Serializable
{
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(name="NAME")
	private String name;
	
	@Column(name="PASSWORD")
	private String password;
	
	@Column(name="EMAIL",nullable=false,unique=true)
	private String email;
	
	@Column(name="MOBILE_NO",nullable=false,unique=true)
	private String mobileNo;
	
	@Column(name="USER_NAME",nullable=false,unique=true)
	private String userName;
	
	//this will decide whether "user" or "admin" or normal user
	@Column(name="ROLE")
	private String role;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public User() {
		super();
		
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", password=" + password + ", email=" + email + ", mobileNo="
				+ mobileNo + ", userName=" + userName + ", role=" + role + "]";
	}
	
	
	
	
	

}

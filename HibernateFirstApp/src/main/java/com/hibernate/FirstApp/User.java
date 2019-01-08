package com.hibernate.FirstApp;

public class User {
	private int userId;
	private String userName;
	private String email;
	private String logonLocation;
	

	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getLogonLocation() {
		return logonLocation;
	}
	public void setLogonLocation(String logonLocation) {
		this.logonLocation = logonLocation;
	}
	
	public User(String userName, String email, String logonLocation) {
		super();
		this.userName = userName;
		this.email = email;
		this.logonLocation = logonLocation;
	}
	
	
}

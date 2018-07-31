package com.deloitte.main;

public class User {
	 
	int id;
	private String firstName;
	private String lastName;
	private String username;
	private String passwd;
	private String status;
	public User(int id, String firstName, String lastName, String username, String passwd, String status) {
		
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.username = username;
		this.passwd = passwd;
		this.status = status;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
}

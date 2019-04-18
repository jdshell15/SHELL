package com.revature.users;



public class Users{
	private int id;
	private String firstname;
	private String lastname;
	private String login;
	private String password;
	private String email;
	private String usertype;
	
	public Users() {
		
	}
	public Users(int id, String firstname, String lastname, String login, String password, String email,
			String usertype) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.login = login;
		this.password = password;
		this.email = email;
		this.usertype = usertype;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUsertype() {
		return usertype;
	}
	public void setUsertype(String usertype) {
		this.usertype = usertype;
	}
	
	
}

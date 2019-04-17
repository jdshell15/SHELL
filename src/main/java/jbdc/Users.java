package jbdc;


public class Users {

	private int id;
	private String firstname;
	private String lastname;
	private String password;
	private String email;
	private String utype;
	private int upending;
	private int uresolved;
	
	

	public Users(String firstname, String lastname, String password, String email, String utype, int upending,
			int uresolved) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.password = password;
		this.email = email;
		this.utype = utype;
		this.upending = upending;
		this.uresolved = uresolved;
	}


	public Users(int id, String firstname, String lastname, String password, String email, String utype, int upending,
			int uresolved) {

		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.password = password;
		this.email = email;
		this.utype = utype;
		this.upending = upending;
		this.uresolved = uresolved;
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


	public String getUtype() {
		return utype;
	}


	public void setUtype(String utype) {
		this.utype = utype;
	}


	public int getUpending() {
		return upending;
	}


	public void setUpending(int upending) {
		this.upending = upending;
	}


	public int getUresolved() {
		return uresolved;
	}


	public void setUresolved(int uresolved) {
		this.uresolved = uresolved;
	}


	@Override
	public String toString() {
		return "Users [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", password=" + password
				+ ", email=" + email + ", utype=" + utype + ", upending=" + upending + ", uresolved=" + uresolved + "]";
	}
	

}



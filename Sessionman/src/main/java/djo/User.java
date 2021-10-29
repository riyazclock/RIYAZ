package djo;

public class User {
	private String fname;
	private String lname;
	private String city;
	private String state;
	private Long phone;
	private String email;


public User() {
	
}


public String getFname() {
	return fname;
}


public void setFname(String fname) {
	this.fname = fname;
}


public String getLname() {
	return lname;
}


public void setLname(String lname) {
	this.lname = lname;
}


public String getCity() {
	return city;
}


public void setCity(String city) {
	this.city = city;
}


public String getState() {
	return state;
}


public void setState(String state) {
	this.state = state;
}


public Long getPhone() {
	return phone;
}


public void setPhone(Long phone) {
	this.phone = phone;
}


public String getEmail() {
	return email;
}


public void setEmail(String email) {
	this.email = email;
}


@Override
public String toString() {
	return "User [fname=" + fname + ", lname=" + lname + ", city=" + city + ", state=" + state + ", phone=" + phone
			+ ", email=" + email + "]";
}

} 
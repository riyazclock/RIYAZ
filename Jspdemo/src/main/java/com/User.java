package com;

public class User {
private String fname;
private String hobby;
private String ambition;

public User(){
	
}


@Override
public String toString() {
	return "User [fname=" + fname + ", hobby=" + hobby + ", ambition=" + ambition + "]";
}


public String getFname() {
	return fname;
}

public void setFname(String fname) {
	this.fname = fname;
}

public String getHobby() {
	return hobby;
}

public void setHobby(String hobby) {
	this.hobby = hobby;
}

public String getAmbition() {
	return ambition;
}

public void setAmbition(String ambition) {
	this.ambition = ambition;
}



}

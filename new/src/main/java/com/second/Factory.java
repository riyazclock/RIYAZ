package com.second;

import org.springframework.stereotype.Component;

@Component("abc")
public class Factory {
 
	private String nmachine;
	private int nomachine;
	
	public String getNmachine() {
		return nmachine;
	}
	public void setNmachine(String nmachine) {
		this.nmachine = nmachine;
	}
	public int getNomachine() {
		return nomachine;
	}
	public void setNomachine(int nomachine) {
		this.nomachine = nomachine;
	}
	
	public void incharge(){
		System.out.println("machine incharge");
	}
}

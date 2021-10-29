package com.second;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value="prototype")
public class Empy {
	private String ename;
	private int eage;
	@Autowired
	@Qualifier("abc")
	private Factory f;

	public Empy(){
		System.out.println("i am employee");
	}
	
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public int getEage() {
		return eage;
	}
	public void setEage(int eage) {
		this.eage = eage;
	}
	
	public void comity() {
		System.out.println("we will be there");
	}

}

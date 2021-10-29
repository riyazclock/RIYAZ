package com.hib.Hibdemo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

//@Entity(name="Student")
@Entity
@Table(name="student")
public class Alian {
	@Id
	private int id;
	private Names name;
	@Transient  //delete
	@Column(name="humanage")
	private int age;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
    public Names getName() {
		return name;
	}
	public void setName(Names name) {
		this.name = name;
	}
	//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Alian [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	
	
}

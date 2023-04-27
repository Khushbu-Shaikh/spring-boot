package com.stud.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long sId;
	private String sFirstName;
	private String sLastName;
	private String sEmail;	
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String sFirstName, String sLastName, String sEmail) {
		super();
		this.sFirstName = sFirstName;
		this.sLastName = sLastName;
		this.sEmail = sEmail;
	}
	public long getsId() {
		return sId;
	}
	public void setsId(long sId) {
		this.sId = sId;
	}
	public String getsFirstName() {
		return sFirstName;
	}
	public void setsFirstName(String sFirstName) {
		this.sFirstName = sFirstName;
	}
	public String getsLastName() {
		return sLastName;
	}
	public void setsLastName(String sLastName) {
		this.sLastName = sLastName;
	}
	public String getsEmail() {
		return sEmail;
	}
	public void setsEmail(String sEmail) {
		this.sEmail = sEmail;
	}

}

package com.spring.businessObject;

import java.util.ArrayList;
import java.util.Date;

import javax.validation.constraints.*;

public class Student {
	
	@Pattern (regexp = "[^0-9]*")
	private String studentName;
	@Size(min = 2, max = 20, message = "Please enter value between {min} and {max}")
	private String studentHobby;
	@Max(1000000000)
	private Long studentMobile;
	@Past
	private Date DOB;
	private ArrayList<String> studentSkills;
	private Address studentAddress;

	public Address getStudentAddress() {
		return studentAddress;
	}

	public ArrayList<String> getStudentSkills() {
		return studentSkills;
	}

	public void setStudentSkills(ArrayList<String> studentSkills) {
		this.studentSkills = studentSkills;
	}

	public void setStudentAddress(Address studentAddress) {
		this.studentAddress = studentAddress;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentHobby() {
		return studentHobby;
	}

	public void setStudentHobby(String studentHobby) {
		this.studentHobby = studentHobby;
	}

	public Long getStudentMobile() {
		return studentMobile;
	}

	public void setStudentMobile(Long studentMobile) {
		this.studentMobile = studentMobile;
	}

	public Date getDOB() {
		return DOB;
	}

	public void setDOB(Date dOB) {
		DOB = dOB;
	}

}

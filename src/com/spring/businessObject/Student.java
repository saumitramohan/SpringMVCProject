package com.spring.businessObject;

import java.util.ArrayList;
import java.util.Date;
import javax.validation.constraints.Size;

public class Student {

	private String studentName;
	@Size(min = 2, max = 20, message = "Please enter value between {min} and {max}")
	private String studentHobby;
	private Long studentMobile;
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

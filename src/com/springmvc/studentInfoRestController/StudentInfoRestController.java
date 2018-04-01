package com.springmvc.studentInfoRestController;
import java.util.ArrayList;

import org.apache.tomcat.util.http.parser.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.spring.businessObject.Student;

@RestController
public class StudentInfoRestController {

	@RequestMapping (value = "/student", method = RequestMethod.GET, produces = org.springframework.http.MediaType.APPLICATION_XML_VALUE)
	public ArrayList <Student> getStudentList(){
		Student student1 = new Student();
		Student student2 = new Student();
		Student student3 = new Student();
		student1.setStudentName("Saumitra");
		student2.setStudentName("Mohan");
		student3.setStudentName("Shukla");
		ArrayList<Student> list = new ArrayList<>();
		list.add(student1);
		list.add(student2);
		list.add(student3);
		return list;	
	}
	
	@RequestMapping (value = "/student/{name}", method = RequestMethod.GET)
	public Student getStudentData(@PathVariable ("name") String name){
		Student student1 = new Student();
		student1.setStudentName(name);
		student1.setStudentMobile((long) 187654);
		return student1;	
	}
	
	@RequestMapping (value = "/student/{name}", method = RequestMethod.PUT)
	public boolean getStudentData(@PathVariable ("name") String name, @RequestBody Student student){
		System.out.println("Student name "+ student.getStudentName());
		System.out.println("Student Hobby "+ student.getStudentHobby());
		System.out.println("Student DOB "+ student.getDOB());
		System.out.println("Student Mobile "+ student.getStudentMobile());
		return true;	
	}
}

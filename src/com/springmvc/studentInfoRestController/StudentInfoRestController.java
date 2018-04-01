package com.springmvc.studentInfoRestController;
import java.util.ArrayList;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
	
	@RequestMapping (value = "/student/{name}", method = RequestMethod.PUT, consumes = org.springframework.http.MediaType.APPLICATION_XML_VALUE)
	public ResponseEntity <Student>  updateStudentData(@PathVariable ("name") String name, @RequestBody Student student){
		System.out.println("Student name "+ student.getStudentName());
		System.out.println("Student Hobby "+ student.getStudentHobby());
		System.out.println("Student DOB "+ student.getDOB());
		System.out.println("Student Mobile "+ student.getStudentMobile());
		HttpHeaders header = new HttpHeaders();
		header.add("HelloKey", "Hello");
		header.add("Resposne", "Hi");
		return new ResponseEntity(student,header,HttpStatus.OK);
	}
	
	@RequestMapping (value = "/student", method = RequestMethod.POST, consumes = org.springframework.http.MediaType.APPLICATION_XML_VALUE)
	public ResponseEntity <Student>  insertStudentData(String name, @RequestBody Student student){
		System.out.println("Student name "+ student.getStudentName());
		System.out.println("Student Hobby "+ student.getStudentHobby());
		System.out.println("Student DOB "+ student.getDOB());
		System.out.println("Student Mobile "+ student.getStudentMobile());
		HttpHeaders header = new HttpHeaders();
		header.add("HelloKey", "Hello");
		header.add("Resposne", "Hi");
		return new ResponseEntity(student,header,HttpStatus.OK);
	}
}

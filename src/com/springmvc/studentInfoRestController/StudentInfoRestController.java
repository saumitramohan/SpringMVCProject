package com.springmvc.studentInfoRestController;
import java.util.ArrayList;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.spring.businessObject.Student;

@RestController
public class StudentInfoRestController {

	@RequestMapping (value = "/student", method = RequestMethod.GET)
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
}

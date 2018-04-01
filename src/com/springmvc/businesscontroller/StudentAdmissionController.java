package com.springmvc.businesscontroller;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springmvc.propertyeditor.StudentNamePropertyEditor;

import com.spring.businessObject.Student;

@Controller
public class StudentAdmissionController {

	// Basic example of data binding
	// Spring uses property editor to internally bind the data
	// Type conversion
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		// binder.setDisallowedFields(new String[] {"studentMobile"});
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
		binder.registerCustomEditor(Date.class, "DOB", new CustomDateEditor(dateFormat, false));
		binder.registerCustomEditor(String.class, "studentName", new StudentNamePropertyEditor());
	}

	@RequestMapping(value = "/admissionForm.html", method = RequestMethod.GET)
	public ModelAndView getAdmissionForm() throws Exception {
		String NPE = "NULL";
		if (NPE.equalsIgnoreCase("NULL")) {
			throw new NullPointerException();
		}
		ModelAndView model = new ModelAndView("AdmissionForm");
		return model;
	}

	// @RequestMapping (value = "/submitAdmissionForm.html", method =
	// RequestMethod.POST)
	// public ModelAndView submitAdmissionForm(@RequestParam (value = "studentName",
	// defaultValue = "Saumitra") String name, @RequestParam ("studentGrade") String
	// grade) {
	// Student student = new Student(name,grade);
	// ModelAndView model = new ModelAndView("AdmissionSuccess");
	// model.addObject("headerMsg","University of California, Irvine - Tutorial");
	// model.addObject("student", student);
	// return model;
	//
	// }

	// AutoDataBinding
	@RequestMapping(value = "/submitAdmissionForm.html", method = RequestMethod.POST)
	public ModelAndView submitAdmissionForm(@Valid @ModelAttribute("student") Student student, BindingResult result) {
		if (result.hasErrors()) {
			System.out.println("Errors :" + result.getAllErrors());
			ModelAndView model = new ModelAndView("AdmissionForm");
			return model;
		}
		ModelAndView model = new ModelAndView("AdmissionSuccess");
		model.addObject("headerMsg", "University of California, Irvine - Tutorial");
		return model;

	}
	
	@ResponseBody
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
}

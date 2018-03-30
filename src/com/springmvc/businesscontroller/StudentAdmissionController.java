package com.springmvc.businesscontroller;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.spring.businessObject.Student;

@Controller
public class StudentAdmissionController {
	
	// Basic example of data binding
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		binder.setDisallowedFields(new String[] {"studentMobile"});
	}
	
	@RequestMapping (value = "/admissionForm.html", method = RequestMethod.GET)
	public ModelAndView getAdmissionForm() {
		ModelAndView model = new ModelAndView("AdmissionForm");
		return model;
	}
	
//	@RequestMapping (value = "/submitAdmissionForm.html", method = RequestMethod.POST)
//	public ModelAndView submitAdmissionForm(@RequestParam (value = "studentName", defaultValue = "Saumitra") String name, @RequestParam ("studentGrade") String grade) {
//		Student student = new Student(name,grade);
//		ModelAndView model = new ModelAndView("AdmissionSuccess");
//		model.addObject("headerMsg","University of California, Irvine - Tutorial");
//		model.addObject("student", student);
//		return model;
//		
//	}
	
	// AutoDataBinding
	@RequestMapping (value = "/submitAdmissionForm.html", method = RequestMethod.POST)
	public ModelAndView submitAdmissionForm(@ModelAttribute ("student") Student student, BindingResult result) {
		if (result.hasErrors()) {
			System.out.println("Errors :"+result.getAllErrors());
			ModelAndView model = new ModelAndView("AdmissionForm");
			return model;
		}
		ModelAndView model = new ModelAndView("AdmissionSuccess");
		model.addObject("headerMsg","University of California, Irvine - Tutorial");
		return model;
		
	}

}

package com.springmvc.businesscontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentAdmissionController {
	
	@RequestMapping (value = "/admissionForm.html", method = RequestMethod.GET)
	public ModelAndView getAdmissionForm() {
		ModelAndView model = new ModelAndView("AdmissionForm");
		return model;
	}
	
	@RequestMapping (value = "/submitAdmissionForm.html", method = RequestMethod.POST)
	public ModelAndView submitAdmissionForm(@RequestParam (value = "studentName", defaultValue = "Saumitra") String name, @RequestParam ("studentGrade") String grade) {
		ModelAndView model = new ModelAndView("AdmissionSuccess");
		model.addObject("msg", "Name of the student "+name+ "Grade is"+grade);
		return model;
		
	}

}

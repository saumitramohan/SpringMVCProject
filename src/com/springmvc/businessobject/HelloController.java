package com.springmvc.businessobject;
import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

// Annotation based approach
@Controller
@RequestMapping ("/SpringWorld")
public class HelloController{

	@RequestMapping ("/welcome/{username}")
	protected ModelAndView helloWorld(@PathVariable ("username") String name) {
		// TODO Auto-generated method stub
		ModelAndView modelandview = new ModelAndView("HelloPage");
		modelandview.addObject("welcomeMessage","Hi "+ name +", Welcome to SpringMVC application");
		return modelandview;
	}
	
	@RequestMapping ("/hi.html")
	protected ModelAndView hi() {
		// TODO Auto-generated method stub
		ModelAndView modelandview = new ModelAndView("HelloPage");
		modelandview.addObject("welcomeMessage","Hi Saumitra, Welcome to SpringMVC application");
		return modelandview;
	}

}

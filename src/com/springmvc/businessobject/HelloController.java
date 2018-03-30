package com.springmvc.businessobject;
import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

// Annotation based approach
@Controller
@RequestMapping ("/SpringWorld")
public class HelloController{

	@RequestMapping ("/welcome.html")
	protected ModelAndView helloWorld() {
		// TODO Auto-generated method stub
		ModelAndView modelandview = new ModelAndView("HelloPage");
		modelandview.addObject("welcomeMessage","Hi User, Welcome to SpringMVC application");
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

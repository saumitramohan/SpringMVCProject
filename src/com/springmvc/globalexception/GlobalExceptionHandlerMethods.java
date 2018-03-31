package com.springmvc.globalexception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandlerMethods {
	
	@ExceptionHandler (value = NullPointerException.class)
	public String handleNullPointerException (Exception e) {
		System.out.println("NPE");
		return "NullPointerException";
	}
	
	@ExceptionHandler (value = Exception.class)
	public String handleGenericException (Exception e) {
		System.out.println("Generic Exception");
		return "Exception";
	}

}

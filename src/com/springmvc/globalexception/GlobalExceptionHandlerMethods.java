package com.springmvc.globalexception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class GlobalExceptionHandlerMethods {
	
	@ResponseStatus (value= HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler (value = NullPointerException.class)
	public String handleNullPointerException (Exception e) {
		System.out.println("NPE");
		return "NullPointerException";
	}
	
	@ResponseStatus (value= HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler (value = Exception.class)
	public String handleGenericException (Exception e) {
		System.out.println("Generic Exception");
		return "Exception";
	}

}

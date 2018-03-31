package com.springmvc.interceptor;

import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class DaysofWeekBasedAccessInterceptor extends HandlerInterceptorAdapter {

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {

		Calendar cal = Calendar.getInstance();
		int dayOfWeek = cal.get(cal.DAY_OF_WEEK);
		if (dayOfWeek == 1) {
			response.getWriter().write("The website is closed on Sunday, please access on any other day");
			return false;
		}
		return true;
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView model) throws Exception{
		System.out.println(" Handler Interceptor-  Spring MVC called for postCompletion"+request.getRequestURI().toString());
	}
	
	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception{
		System.out.println(" Handler Interceptor-  Spring MVC called for after completion"+request.getRequestURI().toString());
	}
}

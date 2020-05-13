package com.baizhi.exception;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

public class GlobalExceptionHandler implements HandlerExceptionResolver {

	@Override
	public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handle,
			Exception ex) {
		// TODO Auto-generated method stub
		String message = null;
		if(ex instanceof ApplicationException){
			ApplicationException ae = (ApplicationException) ex;
			message = ae.getMessage();
		}
		if(ex instanceof SystemException){
			SystemException pe = (SystemException) ex;
			message = pe.getMessage();
		}
		
		ModelAndView maw = new ModelAndView();
		maw.addObject("errorMessage", message);
		maw.setViewName("error");
		
		return maw;
	}
}

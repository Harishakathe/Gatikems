package com.mindworx.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.http.HttpStatus;


@ControllerAdvice
public class GlobalDefaultException {
	
	@ResponseStatus(HttpStatus.NOT_FOUND)  // 404
    @ExceptionHandler(Exception.class)
    public ModelAndView handleNoTFound() {
    	ModelAndView view = new ModelAndView();
    	view.setViewName("404Page");
    			
		return view;
        
    }
	
}

package com.mindworx.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PoMasterController {
	
	@RequestMapping(value = "/po-master", method = RequestMethod.GET)	  
	public ModelAndView poForm() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("po-form");
		return modelAndView;
	}
	
}

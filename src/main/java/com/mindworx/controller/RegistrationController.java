package com.mindworx.controller;

import javax.validation.Valid;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.mindworx.model.User;
import com.mindworx.service.UserService;

@Controller
public class RegistrationController {
	
	@Autowired
	private UserService userService;
	
	public static final Logger log = Logger.getLogger(RegistrationController.class);
	
	@RequestMapping(value = "/registration", method = RequestMethod.GET)
    public ModelAndView showRegistrationForm() {
		log.info("Rendering registration page.");
        ModelAndView model = new ModelAndView();
        model.addObject("user", new User());
        model.setViewName("registration");
        return model;
    }
	
	@RequestMapping(value = "/registration", method = RequestMethod.POST)
    public String registerUserAccount(@ModelAttribute("user")@Valid User user, BindingResult result,RedirectAttributes redirectAttributes,Errors errors) {
		log.info("Submit Registration page.");
		if(result.hasErrors()){
			log.info("Error in Registration"+result.toString());
			return "registration";
		}else{
			userService.create(user);
			redirectAttributes.addFlashAttribute("msg","your account hasbeen created successfully");
			return "login";
		}
		
    }
	
}

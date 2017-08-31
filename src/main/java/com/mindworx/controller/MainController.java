package com.mindworx.controller;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mindworx.dao.PoMasterDao;
import com.mindworx.service.PoMasterService;
@Controller
public class MainController {
	
		@Autowired
		PoMasterDao poMasterDao;
		 
	   @RequestMapping(value = "/admin", method = RequestMethod.GET)
	   public String adminPage(Model model) {
	       return "adminPage";
	   }
	 
	   @RequestMapping(value = "/admin/userInfo", method = RequestMethod.GET)
	   public String userInfo(Model model, Principal principal) {
		   // After user login successfully.
	       String userName = principal.getName();	 
	       System.out.println("User Name: "+ userName);	 
	       return "404Page";
	   }
	   
	   @RequestMapping(value = "/admin/printTable", method = RequestMethod.GET)
	    public ResponseEntity<String> getPrintTable1() {
	    	return new ResponseEntity<String>(poMasterDao.getApiDatabaseTable(), HttpStatus.OK);
	    }
	   
	   @RequestMapping(value = "/admin/descTable/{tablename}", method = RequestMethod.GET)
	    public ResponseEntity<String> getPrintTable2(@PathVariable("tablename") String tablename) {
	    	return new ResponseEntity<String>(poMasterDao.descTable(tablename), HttpStatus.OK);
	   }
	   
	   @RequestMapping(value = "/admin/hardDelete/{no}", method = RequestMethod.GET)
	    public ResponseEntity<String> hardDelete(@PathVariable("no") String no) {
	    	poMasterDao.hardDelete(no);
	    	return null;
	    }
}

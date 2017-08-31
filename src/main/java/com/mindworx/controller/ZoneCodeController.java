package com.mindworx.controller;

import java.util.List;

import org.quartz.Scheduler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mindworx.model.AsnMaster;
import com.mindworx.model.ZoneCode;
import com.mindworx.service.AsnMasterService;
import com.mindworx.service.GitHubLookupService;
import com.mindworx.service.ZoneCodeService;

@RestController
public class ZoneCodeController {
	
	@Autowired 
	private ZoneCodeService zoneCodeService;
	@Autowired 
	private GitHubLookupService gitHubLookupService;
	@Autowired
	AsnMasterService asnMasterService;
	
	@Autowired
	private Scheduler scheduler;
	
	@RequestMapping(value = "admin/zonecode/list", method = RequestMethod.GET)
	public ResponseEntity<?> ZoneCodeList(){
		HttpHeaders headers = new HttpHeaders();
		List<ZoneCode> zoneCodes = zoneCodeService.getAllZoneCode();
		if (zoneCodes == null) { 
			return new ResponseEntity<List<ZoneCode>>(HttpStatus.NOT_FOUND); 
		} 
		headers.add("Number Of Records Found", String.valueOf(zoneCodes.size())); 
		return new ResponseEntity<List<ZoneCode>>(zoneCodes, headers, HttpStatus.OK);
	}
	
	@RequestMapping(value = "admin/zonecode/start", method = RequestMethod.GET)
	public ResponseEntity<?> startShedular(){
		gitHubLookupService.setSflag(true);
		return new ResponseEntity<String>("Start Service", HttpStatus.OK);
	}
	@RequestMapping(value = "admin/zonecode/stop", method = RequestMethod.GET)
	public ResponseEntity<?> stopShedular(){
		
		//gitHubLookupService.setSflag(false);
		return new ResponseEntity<String>("Stop Service", HttpStatus.OK);
	}
	
	
	@RequestMapping(value = "admin/zonecode/pser", method = RequestMethod.GET)
	public ResponseEntity<?> pser(){
		HttpHeaders headers = new HttpHeaders();
		List<AsnMaster> list = asnMasterService.getAllAsnWithDetails();
		if (list == null) { 
			return new ResponseEntity<List<ZoneCode>>(HttpStatus.NOT_FOUND); 
		} 
		headers.add("Number Of Records Found", String.valueOf(list.size())); 
		return new ResponseEntity<List<AsnMaster>>(list, headers, HttpStatus.OK);
	}
	
	
}

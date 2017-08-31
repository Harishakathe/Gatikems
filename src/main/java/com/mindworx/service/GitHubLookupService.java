package com.mindworx.service;

import java.util.Collections;
import java.util.Date;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

import com.mindworx.dao.ZoneCodeDao;
import com.mindworx.model.ZoneCode;

@Service
public class GitHubLookupService {

    private static final Logger log = Logger.getLogger(GitHubLookupService.class);
    private static boolean sflag = false;
    
    
    @Autowired
	ZoneCodeDao zoneCodeDao;
    
    @Scheduled(cron="*/7 * * * * ?")
    public void printUser() throws InterruptedException {
    	
    	 log.info("Start printUser: "+ new Date());
    	 	if(sflag)
    	 	{
    	 		HttpHeaders requestHeaders = new HttpHeaders();
    			requestHeaders.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
    	 		ZoneCode zoneCode = zoneCodeDao.getById(2);
    	 		
    	 		log.info("zoneCode: "+ zoneCode.getLocationName()+" :"+ new Date());
    	 		// Create a new RestTemplate instance
    	 		RestTemplate restTemplate = new RestTemplate();
	 			try {
    	 		    HttpEntity<String> requestEntity = new HttpEntity<String>(new HttpHeaders());
					// Make the HTTP GET request to the Basic Auth protected URL
    	 		    ResponseEntity<String> output = restTemplate.exchange("https://api.github.com/users/Harishakathe", HttpMethod.GET, requestEntity , String.class);
    	 		   log.info(output.getBody());
    	 		} catch (HttpClientErrorException e) {
    	 			log.error("HttpClientErrorException:"+e.getLocalizedMessage());
    	 		    // Handle 401 Unauthorized response
    	 		}
    	 	}
    	 log.info("End printUser: "+ new Date());       
    }

	public static boolean isSflag() {
		return sflag;
	}

	public static void setSflag(boolean sflag) {
		GitHubLookupService.sflag = sflag;
	}  
    

}
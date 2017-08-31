package com.mindworx.job;

import java.util.Collections;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;


import org.apache.log4j.Logger;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

import com.mindworx.model.VtsData;
import com.mindworx.model.ZoneCode;
import com.mindworx.service.ZoneCodeService;



@Component
public class TempHumidityJob implements Job {
	
	@Autowired
    private ZoneCodeService zoneCodeService;
	
	public static final Logger log = Logger.getLogger(TempHumidityJob.class);		

	@Override
	public void execute(JobExecutionContext context) throws JobExecutionException {
		
		HttpHeaders requestHeaders = new HttpHeaders();
		requestHeaders.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
 		List<ZoneCode> zoneCode = zoneCodeService.getAllZoneCode();
 		if(zoneCode.size()>0){
 			// Create a new RestTemplate instance
 	 		RestTemplate restTemplate = new RestTemplate();
 				try {
 	 		    HttpEntity<String> requestEntity = new HttpEntity<String>(new HttpHeaders());
 				// Make the HTTP GET request to the Basic Auth protected URL
 	 		    ResponseEntity<String> output = restTemplate.exchange("https://api.github.com/users/Harishakathe", HttpMethod.GET, requestEntity , String.class);
 	 		   
 	 		    try {
 	 		    	//XMLInputFactory xif = XMLInputFactory.newFactory();
 	 		       //XMLStreamReader xsr = xif.createXMLStreamReader(new StringReader(output.getBody()));
 	 		       // xsr.nextTag(); // Advance to Envelope tag
					JAXBContext jc = JAXBContext.newInstance(VtsData.class);
					Unmarshaller unmarshaller = jc.createUnmarshaller();
					
					
					
					
				} catch (JAXBException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} 
 	 		    
 	 		    log.info(output.getBody());
 	 		} catch (HttpClientErrorException e) {
 	 			log.error("HttpClientErrorException:"+e.getLocalizedMessage());
 	 		    // Handle 401 Unauthorized response
 	 		}
 		}
	}
}

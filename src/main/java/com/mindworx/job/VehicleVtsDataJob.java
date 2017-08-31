package com.mindworx.job;


import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;



import org.apache.log4j.Logger;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;

import org.springframework.web.client.RestTemplate;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.XMLReaderFactory;

import com.mindworx.model.VtsData;
import com.mindworx.service.VtsDataService;

public class VehicleVtsDataJob implements Job{
	
	@Autowired
    private VtsDataService vtsDataService;
	
	public static final Logger log = Logger.getLogger(VehicleVtsDataJob.class);	
	
	@Override
	public void execute(JobExecutionContext context) throws JobExecutionException {
    	log.info("begun Job ** "+context.getJobDetail().getKey().getName()+" ** fired @ "+ context.getFireTime());
    	fillData();
    	log.info("finished Next job scheduled @ "+context.getNextFireTime());
		
	}

	private void fillData() {
		long startTime = System.currentTimeMillis();
		
		RestTemplate restTemplate = new RestTemplate();
		/*HttpEntity<String> requestEntity = new HttpEntity<String>(new HttpHeaders());
		ResponseEntity<String> output = restTemplate.exchange("http://www.latlong.net.in/Client/LatLong_WebService.asmx/GetGPSDataFromLatLong", HttpMethod.GET, requestEntity , String.class);
		String str_xml =  output.getBody();*/
		String str_xml = restTemplate.getForObject("http://www.latlong.net.in/Client/LatLong_WebService.asmx/GetGPSDataFromLatLong", String.class);	
		long endTime   = System.currentTimeMillis();
		log.info("getting request data:"+(endTime - startTime));

		startTime = System.currentTimeMillis();
		List<VtsData> datas = getMList(str_xml);
		endTime   = System.currentTimeMillis();
		log.info("parfseeing data : "+(endTime - startTime));			
		startTime = System.currentTimeMillis();
		vtsDataService.insertBatch(datas);			
		endTime   = System.currentTimeMillis();
		log.info("inserting data : "+(endTime - startTime));
	}
	
	private List<VtsData> getMList(String str_xml){		
		List<VtsData> list = null;
		try {
			list = new ArrayList<VtsData>();
			VtsDataHandler handler = new VtsDataHandler();
			XMLReader parser = XMLReaderFactory.createXMLReader();
			parser.setContentHandler(handler);
			InputSource source = new InputSource(new StringReader(str_xml));
			parser.parse(source);
			list = handler.getList();
		} catch (SAXException e1) {
			log.error("SAXException Job:"+e1.getMessage());
		} catch (IOException e) {
			log.error("IOException Job:"+e.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
			log.error("Exception Job:"+e.getMessage());
		}
		return list; 
	}
		
}

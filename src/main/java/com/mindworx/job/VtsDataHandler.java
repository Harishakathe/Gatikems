package com.mindworx.job;

import java.util.ArrayList;
import java.util.Date;
import java.util.Stack;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import com.mindworx.model.VtsData;

public class VtsDataHandler extends DefaultHandler{
	
	private ArrayList<VtsData> vtsDataList = new ArrayList<VtsData>();
	private Stack<String> elementStack = new Stack<String>();
    private Stack<VtsData> objectStack = new Stack<VtsData>();
    private boolean flag = false;
    private Date currentDate = new Date();
    
    
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException
    {
    	if ("vehicleNumber".equals(qName))//start element
    	{
    		flag = true;
    		VtsData vtsData = new VtsData();
            this.objectStack.push(vtsData);
    	}
    	if (flag)
        {	
    		this.elementStack.push(qName);
        }
    }

    public void endElement(String uri, String localName, String qName) throws SAXException
    {
    	if (flag)
        {	
        	this.elementStack.pop();
        }
        if ("currentspeed".equals(qName))//ending element
        {	
        	flag = false;	
        	VtsData object = (VtsData) this.objectStack.pop();
            this.vtsDataList.add(object);
        }
    }

    /**
     * This will be called everytime parser encounter a value node
     * */
    public void characters(char[] ch, int start, int length) throws SAXException
    {
        String value = new String(ch, start, length).trim();
        
        if (value.length() == 0 )
        {
            return; // ignore white space
        }
        if(!flag)
        {
        	return; // ignore other Tag
        }
        VtsData vtsData = (VtsData) this.objectStack.peek();
        switch (currentElement()) {
		case "vehicleNumber":
			vtsData.setVehicleNumber(value);
			break;
		case "currenttimestamp":
			vtsData.setCurrentTimestamp(value);
			vtsData.setCreatedOn(currentDate);
			break;
		case "currentlocationaddress":	
			vtsData.setCurrentLocationAddress(value);
			break;
		case "currentlocationlatitude":			
			vtsData.setCurrentLocationLatitude(Double.parseDouble(value));
			break;
		case "currentlocationlongitude":
			vtsData.setCurrentLocationLongitude(Double.parseDouble(value));
			break;
		case "currentignitionStatus":
			vtsData.setCurrentIgnitionStatus(value);
			break;
		case "currenttemperature":	
			vtsData.setCurrentTemperature(Double.parseDouble(value));
			break;
		case "CurrentCompressor":
			vtsData.setCurrentCompressor(value);
			break;
		case "currentspeed":
			vtsData.setCurrentSpeed(Integer.parseInt(value));
			break;
		
		}        
    }
    //Accessor for userList object
    public ArrayList<VtsData> getList()
    {
    	return vtsDataList;
    }
    private String currentElement()
    {
        return (String) this.elementStack.peek();
    }
}

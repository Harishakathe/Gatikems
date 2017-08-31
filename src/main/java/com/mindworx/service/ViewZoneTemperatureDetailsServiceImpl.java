package com.mindworx.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindworx.dao.ViewZoneTemperatureDetailsDao;

@Service
public class ViewZoneTemperatureDetailsServiceImpl implements ViewZoneTemperatureDetailsService{
	
	@Autowired
	private ViewZoneTemperatureDetailsDao viewZoneTemperatureDetailsDao;
}

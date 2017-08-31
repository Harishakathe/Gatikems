package com.mindworx.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindworx.dao.IntfstgTrailerDao;

@Service
public class IntfstgTrailerServiceImpl implements IntfstgTrailerService{
	
	@Autowired
	private IntfstgTrailerDao intfstgTrailerDao;
	
	
}

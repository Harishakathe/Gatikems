package com.mindworx.service;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindworx.dao.PoMasterDao;
import com.mindworx.model.PoMaster;
@Service("poMasterService")
public class PoMasterServiceImpl implements PoMasterService{
	
	@Autowired
	private PoMasterDao poMasterDao;
	
	public static final Logger log = Logger.getLogger(PoMasterServiceImpl.class);
	
	@Override
	public List<PoMaster> getAllPoMaster() {
		return poMasterDao.getAllPoMaster();
	}

	@Override
	public PoMaster getById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int createPoMaster(PoMaster poMaster) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updatePoMaster(PoMaster poMaster) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deletePoMaster(long poNo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public PoMaster getPoWithDetails(long poNo) {
		return poMasterDao.getPoWithDetails(poNo);
	}

	@Override
	public List<PoMaster> getAllPoWithDetails() {
		return poMasterDao.getAllPoWithDetails();
	}
	
}

package com.mindworx.service;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindworx.dao.AsnMasterDao;
import com.mindworx.model.AsnMaster;
@Service("asnMasterService")
public class AsnMasterServiceImpl implements AsnMasterService{

	
	@Autowired
	AsnMasterDao asnMasterDao;
	
	public static final Logger log = Logger.getLogger(AsnMasterServiceImpl.class);
	
	@Override
	public List<AsnMaster> getAllAsnMaster() {
		
		return asnMasterDao.getAllAsnMaster();
	}

	@Override
	public AsnMaster getById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AsnMaster getByAsnNo(String asnNo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int createAsnMaster(AsnMaster asnMaster) {
		return asnMasterDao.createAsnMaster(asnMaster);
	}

	@Override
	public int updateAsnMaster(AsnMaster asnMaster) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteAsnMaster(String asnNo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public AsnMaster getAsnWithDetails(long asnNo) {		
		return asnMasterDao.getAsnWithDetails(asnNo);
	}

	@Override
	public List<AsnMaster> getAllAsnWithDetails() {
		return asnMasterDao.getAllAsnWithDetails();
	}

}

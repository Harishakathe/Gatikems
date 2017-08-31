package com.mindworx.service;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindworx.dao.VtsDataDao;
import com.mindworx.model.VtsData;

@Service("vtsDataService")
public class VtsDataServiceImpl implements VtsDataService {

	@Autowired
	VtsDataDao vtsDataDao;
	public static final Logger log = Logger.getLogger(VtsDataServiceImpl.class);	
	
	@Override
	public List<VtsData> getAllVtsData() {
		List<VtsData> vtsDatas = vtsDataDao.getAllVtsData();
		return vtsDatas;
	}

	@Override
	public VtsData getById(long id) {
		VtsData vtsData = vtsDataDao.getById(id);
		return vtsData;
	}

	@Override
	public boolean createVtsData(VtsData vtsData) {
		return vtsDataDao.createVtsData(vtsData);
	}

	@Override
	public void insertBatch(List<VtsData> list) {
		vtsDataDao.insertBatch(list);
		
	}
	
}

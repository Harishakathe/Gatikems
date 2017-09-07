package com.mindworx.service;



import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.mindworx.dao.ConsigneeMasterDao;
import com.mindworx.dao.CustomOptionDao;
import com.mindworx.dao.IntfstgInbsoDao;
import com.mindworx.model.ConsigneeMaster;
import com.mindworx.model.CustomOption;
import com.mindworx.model.IntfstgInbso;
import com.mindworx.model.SoHead;

@Service
public class IntfstgInbsoServiceImpl implements IntfstgInbsoService{
	
	@Autowired	
	private IntfstgInbsoDao intfstgInbsoDao;
	@Autowired	
	private ConsigneeMasterDao consigneeMasterDao;
	@Autowired	
	private CustomOptionDao customOptionDao;

	@Override
	public List<IntfstgInbso> getAll() {
		
		return intfstgInbsoDao.getAll();
	}

	@Override
	public IntfstgInbso getById(long id) {
		return intfstgInbsoDao.getById(id);
	}

	@Override
	public void create(IntfstgInbso intfstgInbso) {
		intfstgInbsoDao.create(intfstgInbso);
	}

	@Override
	public void update(IntfstgInbso intfstgInbso) {
		intfstgInbsoDao.update(intfstgInbso);
	}

	@Override
	public void create(SoHead soHead) {
		intfstgInbsoDao.create(soHead);
	}

	@Override
	public SoHead getSoHead(String so_no) {
		return intfstgInbsoDao.getSoHead(so_no);
	}

	@Override
	public List<ConsigneeMaster> getConsigneeList(String query) {
		return consigneeMasterDao.getAllByName(query);
	}

	@Override
	public List<SoHead> getSoNoList(Date fromDate, Date toDate) {
		return intfstgInbsoDao.getSoNoList(fromDate, toDate);
	}

	@Override
	public List<CustomOption> getSkuByCompId(String CompId) {
		return customOptionDao.getSkuByCompId(CompId);
	}

	@Override
	public List<CustomOption> getUomByCompId(String CompId) {
		return customOptionDao.getUomByCompId(CompId);
	}

}

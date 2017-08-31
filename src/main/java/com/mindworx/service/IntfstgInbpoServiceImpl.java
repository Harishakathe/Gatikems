package com.mindworx.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.stereotype.Service;

import com.mindworx.dao.IntfstgInbpoDao;
import com.mindworx.dao.SupplierMasterDao;
import com.mindworx.model.AsnTrackingRequest;
import com.mindworx.model.IntfstgInbpo;
import com.mindworx.model.IntfstgInbso;
import com.mindworx.model.PoHead;
import com.mindworx.model.SupplierMaster;

@Service
public class IntfstgInbpoServiceImpl implements IntfstgInbpoService{
	
	@Autowired
	private IntfstgInbpoDao intfstgInbpoDao;
	@Autowired
	private SupplierMasterDao supplierMasterDao;

	@Override
	public List<IntfstgInbpo> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IntfstgInbpo getById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean create(IntfstgInbpo intfstgInbpo) {
		return intfstgInbpoDao.create(intfstgInbpo);
	}

	@Override
	public boolean update(IntfstgInbpo intfstgInbpo) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void create(PoHead poHead) {
	        
		intfstgInbpoDao.create(poHead);
	}

	@Override
	 public PoHead getPoHead(String po_no) {
	  return intfstgInbpoDao.getPoHead(po_no);
	 }

	@Override
	public long getCountByDate(AsnTrackingRequest trackingRequest) {
		return intfstgInbpoDao.getCountByDate(trackingRequest);
	}

	@Override
	public long getCountByPoNo(AsnTrackingRequest trackingRequest) {
		return intfstgInbpoDao.getCountByPoNo(trackingRequest);
	}

	@Override
	public long getCountByInvNo(AsnTrackingRequest trackingRequest) {
		return intfstgInbpoDao.getCountByInvNo(trackingRequest);
	}

	@Override
	public long getCountByBatch(AsnTrackingRequest trackingRequest) {
		return intfstgInbpoDao.getCountByBatch(trackingRequest);
	}

	@Override
	public long getCountBySku(AsnTrackingRequest trackingRequest) {
		return intfstgInbpoDao.getCountBySku(trackingRequest);
	}

	@Override
	public List<PoHead> getAllByDate(int offset, int limit, String orderByCol, String sortOrder,
			AsnTrackingRequest trackingRequest) {
		return intfstgInbpoDao.getAllByDate(offset,limit,orderByCol,sortOrder,trackingRequest);
	}

	@Override
	public List<PoHead> getAllByPoNo(int offset, int limit, String orderByCol, String sortOrder,
			AsnTrackingRequest trackingRequest) {
		List<PoHead> poHeads = intfstgInbpoDao.getAllByPoNo(offset,limit,orderByCol,sortOrder,trackingRequest);
		return poHeads;
	}

	@Override
	public List<PoHead> getAllByInvNo(int offset, int limit, String orderByCol, String sortOrder,
			AsnTrackingRequest trackingRequest) {
		List<PoHead> poHeads = intfstgInbpoDao.getAllByInvNo(offset,limit,orderByCol,sortOrder,trackingRequest);
		return poHeads;
	}

	@Override
	public List<PoHead> getAllByBatch(int offset, int limit, String orderByCol, String sortOrder,
			AsnTrackingRequest trackingRequest) {
		List<PoHead> poHeads = intfstgInbpoDao.getAllByBatch(offset,limit,orderByCol,sortOrder,trackingRequest);
		return poHeads;
	}

	@Override
	public List<PoHead> getAllBySku(int offset, int limit, String orderByCol, String sortOrder,
			AsnTrackingRequest trackingRequest) {
		List<PoHead> poHeads = intfstgInbpoDao.getAllBySku(offset,limit,orderByCol,sortOrder,trackingRequest);
		return poHeads;
	}

	@Override
	public <T> long getCount(AsnTrackingRequest<T> asnTrackingRequest) {
		return intfstgInbpoDao.getCount(asnTrackingRequest);
	}

	@Override
	public List<SupplierMaster> getSupplierList(String like) {
		return supplierMasterDao.getAllByName(like);
	}

	@Override
	public List<PoHead> getPoNoList(Date fromDate, Date toDate) {
		return intfstgInbpoDao.getPoNoList(fromDate,toDate);
	}

	
	
	
	
		  
}

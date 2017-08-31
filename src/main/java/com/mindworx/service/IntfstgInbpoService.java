package com.mindworx.service;

import java.util.Date;
import java.util.List;

import com.mindworx.model.AsnTrackingRequest;
import com.mindworx.model.IntfstgInbpo;
import com.mindworx.model.PoHead;
import com.mindworx.model.SupplierMaster;

public interface IntfstgInbpoService {
	public List<IntfstgInbpo> getAll();
	public IntfstgInbpo getById(long id);	
	public boolean create(IntfstgInbpo intfstgInbpo);
	public boolean update(IntfstgInbpo intfstgInbpo);
	public void create(PoHead poHead);
	public PoHead getPoHead(String po_on);
	
	public long getCountByDate(AsnTrackingRequest trackingRequest);
	public long getCountByPoNo(AsnTrackingRequest trackingRequest);
	public long getCountByInvNo(AsnTrackingRequest trackingRequest);
	public long getCountByBatch(AsnTrackingRequest trackingRequest);
	public long getCountBySku(AsnTrackingRequest trackingRequest);
	public <T> long getCount(AsnTrackingRequest<T> asnTrackingRequest);
	
	public List<PoHead> getAllByDate(int offset,int limit,String orderByCol,String sortOrder, AsnTrackingRequest trackingRequest);
	public List<PoHead> getAllByPoNo(int offset,int limit,String orderByCol,String sortOrder, AsnTrackingRequest trackingRequest);
	public List<PoHead> getAllByInvNo(int offset,int limit,String orderByCol,String sortOrder, AsnTrackingRequest trackingRequest);
	public List<PoHead> getAllByBatch(int offset,int limit,String orderByCol,String sortOrder, AsnTrackingRequest trackingRequest);
	public List<PoHead> getAllBySku(int offset,int limit,String orderByCol,String sortOrder, AsnTrackingRequest trackingRequest);
	
	public List<SupplierMaster> getSupplierList(String like);
	public List<PoHead> getPoNoList(Date fromDate, Date toDate);
	
	
	
}

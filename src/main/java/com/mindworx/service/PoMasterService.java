package com.mindworx.service;

import java.util.List;

import com.mindworx.model.PoMaster;

public interface PoMasterService {
	public List<PoMaster> getAllPoMaster();
	public PoMaster getById(long id);
	public int createPoMaster(PoMaster poMaster);
	public int updatePoMaster(PoMaster poMaster);
	public int deletePoMaster(long poNo);
	public PoMaster getPoWithDetails(long poNo);
	public List<PoMaster> getAllPoWithDetails();
	
}

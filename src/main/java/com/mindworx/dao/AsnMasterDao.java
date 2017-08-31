package com.mindworx.dao;

import java.util.List;

import com.mindworx.model.AsnMaster;

public interface AsnMasterDao {
	public List<AsnMaster> getAllAsnMaster();
	public AsnMaster getById(long id);
	public AsnMaster getByAsnNo(String asnNo);	
	public int createAsnMaster(AsnMaster asnMaster);
	public int updateAsnMaster(AsnMaster asnMaster);
	public int deleteAsnMaster(String asnNo);
	public AsnMaster getAsnWithDetails(long asnNo);
	public List<AsnMaster> getAllAsnWithDetails();
}

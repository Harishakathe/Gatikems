package com.mindworx.dao;

import java.util.List;

import com.mindworx.model.PoMaster;

public interface PoMasterDao {
	public List<PoMaster> getAllPoMaster();
	public PoMaster getById(long id);
	public int createPoMaster(PoMaster poMaster);
	public int updatePoMaster(PoMaster poMaster);
	public int deletePoMaster(long poNo);
	public PoMaster getPoWithDetails(long poNo);
	public List<PoMaster> getAllPoWithDetails();
	public String getApiDatabaseTable();
	public String descTable(String tablename);
	public void hardDelete(String no);
}

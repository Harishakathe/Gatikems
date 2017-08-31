package com.mindworx.dao;

import java.util.Date;
import java.util.List;

import com.mindworx.model.ConsigneeMaster;
import com.mindworx.model.SoHead;

public interface ConsigneeMasterDao {
	public List<ConsigneeMaster> getAll();
	public ConsigneeMaster getById(long id);
	public List<ConsigneeMaster> getAllByName(String like);
	
}

package com.mindworx.dao;

import java.util.List;

import com.mindworx.model.AsnMaster;
import com.mindworx.model.CustomOption;

public interface CustomOptionDao {
	public List<CustomOption> getSkuByCompId(String CompId);
	public List<CustomOption> getUomByCompId(String compId);	
}

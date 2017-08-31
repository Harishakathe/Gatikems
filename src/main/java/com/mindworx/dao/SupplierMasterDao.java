package com.mindworx.dao;

import java.util.List;

import com.mindworx.model.ConsigneeMaster;
import com.mindworx.model.SupplierMaster;

public interface SupplierMasterDao {
	public List<SupplierMaster> getAll();
	public SupplierMaster getById(long id);
	public List<SupplierMaster> getAllByName(String like);
}

package com.mindworx.dao;

import java.util.List;

import com.mindworx.model.VtsData;


public interface VtsDataDao {
	public List<VtsData> getAllVtsData();
	public VtsData getById(long id);
	public boolean createVtsData(VtsData vtsData);
	public void insertBatch(List<VtsData> list);
}

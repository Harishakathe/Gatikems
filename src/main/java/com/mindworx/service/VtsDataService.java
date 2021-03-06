package com.mindworx.service;

import java.util.List;

import com.mindworx.model.VtsData;

public interface VtsDataService {
	public List<VtsData> getAllVtsData();
	public VtsData getById(long id);
	public boolean createVtsData(VtsData vtsData);
	public void insertBatch(List<VtsData> list);
}

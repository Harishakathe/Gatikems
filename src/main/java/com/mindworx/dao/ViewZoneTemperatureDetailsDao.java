package com.mindworx.dao;

import java.util.List;

import com.mindworx.model.ViewZoneTemperatureDetails;

public interface ViewZoneTemperatureDetailsDao {
	public List<ViewZoneTemperatureDetails> getAll();
	public ViewZoneTemperatureDetails getById(long id);	
	public boolean create(ViewZoneTemperatureDetails viewZoneTemperatureDetails);
	public boolean update(ViewZoneTemperatureDetails viewZoneTemperatureDetails);
}

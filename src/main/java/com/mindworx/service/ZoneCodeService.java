package com.mindworx.service;

import java.util.List;

import com.mindworx.model.ZoneCode;

public interface ZoneCodeService {
	public List<ZoneCode> getAllZoneCode();
	public ZoneCode getById(long id);
	public ZoneCode getByZoneCode(long id);
	public int createZoneCode(ZoneCode zoneCode);
	public int updateZoneCode(ZoneCode zoneCode);
}

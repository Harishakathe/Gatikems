package com.mindworx.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindworx.dao.ZoneCodeDao;
import com.mindworx.model.ZoneCode;
@Service("zoneCodeService")
public class ZoneCodeServiceImpl implements ZoneCodeService {
	
	@Autowired
	ZoneCodeDao zoneCodeDao;

	@Override
	public List<ZoneCode> getAllZoneCode() {
		List<ZoneCode> zoneCodes = zoneCodeDao.getAllZoneCode();
		return zoneCodes;
	}

	@Override
	public ZoneCode getById(long id) {
		ZoneCode zoneCode = zoneCodeDao.getById(id);
		return zoneCode;
	}

	@Override
	public ZoneCode getByZoneCode(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int createZoneCode(ZoneCode zoneCode) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateZoneCode(ZoneCode zoneCode) {
		// TODO Auto-generated method stub
		return 0;
	}

}

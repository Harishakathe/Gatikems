package com.mindworx.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.mindworx.model.ZoneCode;

@Repository
public class ZoneCodeDaoImpl implements ZoneCodeDao {
	
	/*@Autowired
	private JdbcTemplate jdbcTemplate;*/
	private JdbcTemplate jdbcTemplate;

    public void dataSource(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }
	
	@Override
	public List<ZoneCode> getAllZoneCode() {
		List<ZoneCode> list = null;
		try {
			list = jdbcTemplate.query("SELECT * FROM zone_code_master", new BeanPropertyRowMapper<ZoneCode>(ZoneCode.class));
		} catch (DataAccessException e) { 
			e.printStackTrace(); 
		}
		return list;
	}

	@Override
	public ZoneCode getById(long sr_no) {
		ZoneCode zoneCode = null;
		try {
			zoneCode = jdbcTemplate.queryForObject("SELECT * FROM zone_code_master WHERE sr_no = ?", new Object[]{sr_no}, new BeanPropertyRowMapper<ZoneCode>(ZoneCode.class));
		} catch (DataAccessException e) { 
			e.printStackTrace(); 
		}
		return zoneCode;
	}

	@Override
	public ZoneCode getByZoneCode(long id) {
		return null;
	}

	@Override
	public int createZoneCode(ZoneCode zoneCode) {
		return 0;
	}

	@Override
	public int updateZoneCode(ZoneCode zoneCode) {
		return 0;
	}

}

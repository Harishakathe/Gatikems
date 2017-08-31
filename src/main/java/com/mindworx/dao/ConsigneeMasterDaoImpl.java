package com.mindworx.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.simple.ParameterizedBeanPropertyRowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.mindworx.model.ConsigneeMaster;
import com.mindworx.model.ZoneCode;

@Repository
@Transactional
public class ConsigneeMasterDaoImpl implements ConsigneeMasterDao{
	
	private JdbcTemplate jdbcTemplate;
	private JdbcTemplate jdbcTemplateProd;
	public final static RowMapper<ConsigneeMaster> consigneeMasterMapper = ParameterizedBeanPropertyRowMapper.newInstance(ConsigneeMaster.class);
	
	@Autowired
    public void dataSource(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }
	
	@Autowired
    public void prodDataSource(DataSource oracelDbSource) {
        this.jdbcTemplateProd = new JdbcTemplate(oracelDbSource);
    }

	@Override
	public List<ConsigneeMaster> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ConsigneeMaster getById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ConsigneeMaster> getAllByName(String like) {
		List<ConsigneeMaster> list = null;
		try {
			list = jdbcTemplateProd.query("SELECT * FROM VIEW_MAST_CONSIGNEE WHERE CONSIGNEE_NAME LIKE '"+like+"%' ",consigneeMasterMapper);
		} catch (DataAccessException e) { 
			e.printStackTrace(); 
		}
		return list;		
	}
}

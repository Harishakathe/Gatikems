package com.mindworx.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.simple.ParameterizedBeanPropertyRowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.mindworx.model.SupplierMaster;

@Repository
@Transactional
public class SupplierMasterDaoImpl implements SupplierMasterDao{
	
	private JdbcTemplate jdbcTemplate;
	private JdbcTemplate jdbcTemplateProd;
	public final static RowMapper<SupplierMaster> supplierMasterMapper = ParameterizedBeanPropertyRowMapper.newInstance(SupplierMaster.class);
	
	@Autowired
    public void dataSource(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }
	
	@Autowired
    public void prodDataSource(DataSource oracelDbSource) {
        this.jdbcTemplateProd = new JdbcTemplate(oracelDbSource);
    }

	@Override
	public List<SupplierMaster> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SupplierMaster getById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<SupplierMaster> getAllByName(String like) {
		List<SupplierMaster> list = null;
		try {
			list = jdbcTemplateProd.query("SELECT SUPP_ID ,SUPP_NAME FROM VIEW_MAST_SUPPLIER WHERE SUPP_NAME LIKE '"+like+"%' ",supplierMasterMapper);
		} catch (DataAccessException e) { 
			e.printStackTrace(); 
		}
		return list;		
	}
}
